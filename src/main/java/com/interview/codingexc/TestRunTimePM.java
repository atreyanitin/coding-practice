package com.interview.codingexc;

import java.util.HashMap;
import java.util.Map;

public class TestRunTimePM {
	
	static class Parent{
		String name = "Parent";
		public void m1(){
			System.out.println("Parent's m1");
		}
		public String getName(){
			return name;
		}
		public void setName(String nm){
			name=nm;
		}
		
		@Override
		public boolean equals(Object o){
			if(o==null || (o.getClass() != this.getClass()))
				return false;
			else{
				System.out.println("Parent's equals");
				return ((Parent)o).getName().equals(this.getName());
			}
				
			
		}
		
		@Override
		public int hashCode(){
			System.out.println("Parent's HashCode");
			return 1;
		}
	};
	
	
   static class Child extends Parent{
		public void m1(){
			System.out.println("Child's m1");
		}
		
		public void m2(){
			System.out.println("Child's m2");
		}
		
		@Override
		public boolean equals(Object o){
			if(o==null || (o.getClass() != this.getClass()))
				return false;
			else{
				System.out.println("Child's equals");
				return ((Child)o).getName().equals(this.getName());
			}
			
		}
		
		@Override
		public int hashCode(){
			System.out.println("Child's HashCode");
			return name.hashCode();
		}
	}
   
   public static void main(String args[]){
	   
	   Parent p = new Parent();
	   p.setName("Nitin");
	   
	   Parent s = new Parent();
	   s.setName("Shruti");
	   
	   Parent x = new Child();
	   x.setName("bablu");
	   
	   Child c = new Child();
	   c.setName("Shivi");
	   
	   Map<Parent, Child> map = new HashMap<Parent,Child>();
	   map.put(p,c);
	   map.put(s,c);
	   System.out.println(map.size());
	   System.out.println(map.get(s).getName());
   }
}
