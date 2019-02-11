package com.corejava.serialization;


import java.io.*;


public class SerialPutFieldsExample {

    public static void main(String args[]) {

	// create a Car object
	CarSerPutFields car = new CarSerPutFields("Mitsubishi", 2009);
	CarSerPutFields newCar = null;

	//serialize the car
	try {
	    FileOutputStream fo = new FileOutputStream("tmp");
	    ObjectOutputStream so = new ObjectOutputStream(fo);
	    so.writeObject(car);
	    so.flush();
	} catch (Exception e) {
	    System.out.println(e);
	    System.exit(1);
	}

	// de-serialize the Car
	try {
	    FileInputStream fi = new FileInputStream("tmp");
	    ObjectInputStream si = new ObjectInputStream(fi);
	    newCar = (CarSerPutFields) si.readObject();
	}
	catch (Exception e) {
	    System.out.println(e);
	    System.exit(1);
	}

	/*
	 * Print out the original and new car information
	 */
	System.out.println("The original car is ");
	System.out.println(car);
	System.out.println("The new car is ");
        System.out.println(newCar);
    }
}