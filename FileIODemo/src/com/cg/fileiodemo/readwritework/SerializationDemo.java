package com.cg.fileiodemo.readwritework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cg.fileiodemo.beans.Address;
import com.cg.fileiodemo.beans.Customer;

public class SerializationDemo {
	public static void doSerialization(File file)throws FileNotFoundException, IOException{
		try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file))){
			Customer customer = new Customer(111,"Satish","Mahajan", new Address("pune" , "india"));
			writer.writeObject(customer);
			System.out.println("Customer object transferred to " + file.getAbsolutePath());
		}
	}
	
	public static void doDeSerialization(File file)throws FileNotFoundException, IOException, ClassNotFoundException{
		try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))){
			Customer customer =  (Customer)reader.readObject();
			System.out.println(customer);
		}
	}
}
