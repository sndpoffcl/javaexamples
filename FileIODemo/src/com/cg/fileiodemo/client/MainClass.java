package com.cg.fileiodemo.client;

import java.io.File;
import java.io.IOException;

import com.cg.fileiodemo.readwritework.ReadWriteWork;
import com.cg.fileiodemo.readwritework.SerializationDemo;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
//			File file = new File("d:\\DataFile.txt");
//			if(!file.exists()) {
//				file.createNewFile();
//			}
//			System.out.println(file.canWrite());
//			System.out.println(file.canExecute());
//			System.out.println(file.getName());
//			System.out.println(file.getAbsolutePath());
//			System.out.println(file.getPath());
//			System.out.println(file.length());
			
//			File fileFrom = new File("D:\\CiSession.txt");
//			File fileTo = new File("D:\\temp\\"+ fileFrom.getName());
//			
//			ReadWriteWork.byteStreamReadWrite(fileFrom, fileTo);
//		
//			File fileFrom = new File(".//resources//project.properties");
//			ReadWriteWork.propertiesWork(fileFrom);
			
			
			File file = new File(".//resources//project.properties"); 
			SerializationDemo.doSerialization(file);
			SerializationDemo.doDeSerialization(file);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
