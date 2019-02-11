package com.corejava.serialization;

import java.io.*;

public class CarSer implements Serializable {

    String name;
    int year;

    private final static ObjectStreamField[]
	    serialPersistentFields = {
	      new ObjectStreamField(
	      "name", String.class)
    };

    /*
     * mandatory public no-arg constructor
     */
    public CarSer() { super();
    	System.out.println("Default Constructor Called");
    }

    CarSer(String n, int y) {
		name = n;
		year = y;
		System.out.println("arg Constructor Called");
    }

    /**
     * Mandatory writeExernal method.
     */

 /*	public void writeExternal(ObjectOutput out) throws IOException  {
		System.out.println("writeExternal");
		out.writeObject(name);
		out.writeInt(year);
    }*/

    /**
     * Mandatory readExternal method.
     */
    /*
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("readExternal");
		name = (String) in.readObject();
		year = in.readInt();
    }*/


    /*
    private void writeObject(java.io.ObjectOutputStream out) throws IOException{
			System.out.println("writeObject");
			out.defaultWriteObject();
			//out.writeInt(year);
	}*/

	/**
	 * Mandatory readExternal method.
	 */
	/*private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
			System.out.println("readObject");
			in.defaultReadObject();
			//name = (String)in.readObject();
			year = year+1;
	}*/


    /**
     * Prints out the fields. used for testing!
     */
    public String toString() {
        return("Name: " + name + "\n" + "Year: " + year);
    }

}