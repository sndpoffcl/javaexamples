package com.cg.project.innerdemo;

public class MainClass {
	public static void main(String[] args) {
		//static inner classes
		
		
		HotelClass.VegKitchen vegKitchen = new HotelClass.VegKitchen();
		
		HotelClass.NonVegKitchen nonVegKitchen = new HotelClass.NonVegKitchen();
	}
}
