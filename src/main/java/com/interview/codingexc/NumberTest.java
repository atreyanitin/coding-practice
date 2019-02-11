package com.interview.codingexc;

import java.util.Scanner;
import java.util.logging.Logger;

public class NumberTest {
	static Logger log = Logger.getLogger(NumberTest.class.toString());
	 
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String input = scan.next();
		int number = Integer.parseInt(input,10);
		System.out.println("Decimal : "+ number);
		System.out.println("Binary : "+ Integer.toBinaryString(number));
		System.out.println("Octal: "+ Integer.toOctalString(number));
		System.out.println("Hexa : "+ Integer.toHexString(number));
		System.out.println("Reverse  : "+ String.valueOf(reverseNumber(number)));
		
		
		
		System.out.println(" white space : "+ Character.getNumericValue(' '));
		System.out.println(" white space : "+ Character.getNumericValue('a'));
		trim();
		
	}
	
	public static int reverseNumber(int num){
		int result = 0;
		while(num !=0)
		{
			int lastdigit  = num%10;
			result = result*10+lastdigit;
			num = num / 10 ;
		}
		return result;
		
	}
	
	 public static String trim() {
	        char[] value =new String("   Hello World   ").toCharArray();
	        int len = value.length;
	        int st = 0;
	        char[] val = value;    /* avoid getfield opcode */

	        while ((st < len) && (val[st] <= ' ')) {
	            System.out.println(" value of char : "+  Character.getNumericValue(val[st]));
	        	st++;
	        }
	        while ((st < len) && (val[len - 1] <= ' ')) {
	            System.out.println(" value of char : "+ Character.getNumericValue(val[st]));
	            len--;
	        }
	        return "";//((st > 0) || (len < value.length)) ? substring(st, len) : this;
	    }

}
