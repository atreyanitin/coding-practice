package com.corejava.serialization;

import java.io.*;

public class Car implements Externalizable {

    String name;
    int year;

    /*
     * mandatory public no-arg constructor
     */
    public Car() { super();
    	System.out.println("Default Constructor Called");
    }

    Car(String n, int y) {
	name = n;
	year = y;
	System.out.println("arg Constructor Called");
    }

    /**
     * Mandatory writeExernal method.
     */
    public void writeExternal(ObjectOutput out) throws IOException  {
		System.out.println("writeExternal");
		out.writeObject(name);
		out.writeInt(year);
    }

    /**
     * Mandatory readExternal method.
     */
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("readExternal");
		//name = (String) in.readObject();
		//year = in.readInt();
    }

    /**
     * Prints out the fields. used for testing!
     */
    public String toString() {
        return("Name: " + name + "\n" + "Year: " + year);
    }




}