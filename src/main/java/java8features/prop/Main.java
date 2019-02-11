package java8features.prop;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Main {
	
	@Inject
	@Property(key="first.1")
	String value;
	
	public String getValue() {
		return value;
	}

	public static void main(String args[]) {
		Main m = new Main();
		System.out.println(m.getValue());
	}
	
}
