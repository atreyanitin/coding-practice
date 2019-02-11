package java8features.prop;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

@ApplicationScoped
@Startup
public class PropProducer {
	Properties property;

	@Property
	@Produces
   public String produceString(InjectionPoint ip){
		return property.getProperty(ip.getMember().getName());
	}

	@PostConstruct
	public void init() {
		this.property = new Properties();
		InputStream is = PropProducer.class.getResourceAsStream("/application.properties");
		if (is == null) {
			throw new RuntimeException();
		}

		try {
			this.property.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
