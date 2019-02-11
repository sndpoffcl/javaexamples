package com.cg.project.innerdemo;

public class HotelClass {
	interface FoodOrderListener{
		void cookAFood(String foodName);
	}
	
	static class  VegKitchen implements FoodOrderListener{
		@Override
		public void cookAFood(String foodName) {
			System.out.println(foodName + " is ready.");
		}
	}
	
	static class NonVegKitchen implements FoodOrderListener{
		@Override
		public void cookAFood(String foodName) {
			System.out.println(foodName + " is ready.");
		}
	}
}
