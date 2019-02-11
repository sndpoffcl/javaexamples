package com.cg.project.innerdemo;

public class MainClass {
	public static void main(String[] args) {
		HotelClass hotel = new HotelClass();
		
		HotelClass.VegKitchen vegKitchen = hotel.new VegKitchen();
		
		HotelClass.NonVegKitchen nonVegKitchen = hotel.new NonVegKitchen();
	}
}
