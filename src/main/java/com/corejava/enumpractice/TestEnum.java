package com.corejava.enumpractice;

public class TestEnum{

	public static void main(String args[]){

		for(Color c: Color.values()) {

			System.out.println(c);
		}

		Color c1 = Color.valueOf(Color.class,"RED");
		System.out.println("Name : "+c1.name());
		System.out.println("Ordinal : "+c1.ordinal());
		System.out.println(Color.valueOf(Color.values()[0].name()));



	}

}