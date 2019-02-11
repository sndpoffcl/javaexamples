package com.cg.project.innerdemo;

public class HotelClass {
	interface FoodOrderListener{
		void cookAFood(String foodName);
	}
	
	class VegKitchen implements FoodOrderListener{
		@Override
		public void cookAFood(String foodName) {
			System.out.println(foodName + " is ready.");
		}
	}
	
	class NonVegKitchen implements FoodOrderListener{
		@Override
		public void cookAFood(String foodName) {
			System.out.println(foodName + " is ready.");
		}
	}
}
