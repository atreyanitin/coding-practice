package com.corejava.enumpractice;

public class TestOldWayEnum{

	public static void main(String args[]) {

		/*for(int o : OldColor.values()){
			System.out.println(o);
		}*/

		int color = OldColor.GREEN;

		switch(OldColor.BLUE){

		default:
							System.out.println("Bad LUCK");
		case OldColor.RED:
							System.out.println("RED");
							break;

		case OldColor.BLUE:
							System.out.println("BLUE");
							break;



		}





	}

}