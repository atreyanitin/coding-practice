package java8features.defaults;

public class App {
	public Liberary myLibrary;
	
	public static void main(String args[]) {

		App myApp = new App();
		
		myApp.init();
		//Customer
	}
	
	/*public boolean isRegistered(String userId) {
		return myLibrary.allMembers().contains(userId);
	}
	
	public void issue(String book, String userid) {
		myLibrary.issue( book,  userid);
	}*/

	public void init() {
		 myLibrary = new Liberary();
		
		Calculator casio1 = new Calculator();
		Calculator casio2 = new Calculator();
		
		myLibrary.setCalculator(casio1);
	}
	
	public void printDetails() {
		
	}
}
