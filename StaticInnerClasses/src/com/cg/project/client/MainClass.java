package com.cg.project.client;

import com.cg.project.services.ProjectServices;

public class MainClass {
	public static void main(String[] args) {
		ProjectServices services = new ProjectServices() {
			@Override
			public void developProject() {
				System.out.println("IT project has developed");
			}
		};
	}
}
