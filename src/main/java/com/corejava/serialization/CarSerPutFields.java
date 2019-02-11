package com.corejava.serialization;

import java.io.*;


public class CarSerPutFields implements Serializable {

    String name;
    int year;

    /*private final static ObjectStreamField[]
	    serialPersistentFields = {
	      new ObjectStreamField(
	      "name", String.class)
    };*/

    /*
     * mandatory public no-arg constructor
     */
    public CarSerPutFields() { super();
    	System.out.println("Default Constructor Called");
    }

    CarSerPutFields(String n, int y) {
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


       private void writeObject(java.io.ObjectOutputStream out) throws IOException{
			System.out.println("writeObject");

			 ObjectOutputStream.PutField fields =
   			 out.putFields();
   			 fields.put("year",1979);
   			 out.writeFields();
	}

	/**
	 * Mandatory readExternal method.
	 */
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
			System.out.println("readObject");
			ObjectInputStream.GetField
     		fields = in.readFields();
     		int year2 = fields.get("year",(int)0);
     		System.out.println(year2 + " < Year as read");
     		year = year2+1;

	}


    /**
     * Prints out the fields. used for testing!
     */
    public String toString() {
        return("Name: " + name + "\n" + "Year: " + year);
    }

}