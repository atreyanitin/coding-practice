package java8features.defaults;

import java.beans.Statement;
import java.util.List;

public class Liberary {
	Calculator calculator;

	/**
	 * @return the calculator
	 */
	public Calculator getCalculator() {
		return calculator;
	}

	/**
	 * @param calculator the calculator to set
	 */
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	/*public List<String> allMembers() {
		
		Connection conn = new Connection("database link", userid, password);
				Statement stmt = conn.getStatement();
				return stmt.execute("select * from members");
				
				statement.execute()
		
	}

	public void issue(String book, String userid) {
		Connection conn = new Connection("database link", userid, password);
		Statement stmt = conn.getStatement();
		return stmt.execute("update * from members");
		
		statement.execute()
		
	}*/
}
