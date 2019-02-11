package com.cg.project.lambdainterface.WorkService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.*;
import com.cg.project.beans.Employee;
import com.cg.project.lambdainterface.FunctionalInterface2;
import com.cg.project.lambdainterface.FuntionalInterface1;

public class MainClass {
	public static void main(String[] args) {
//		WorkService service = () -> System.out.println("Work in progress");
//	
//		callForWork(service);
//		
//		callForWork(() -> System.out.println("Work in progress"));
//		FuntionalInterface1 ref1  = (firstName , lastName) -> System.out.println("good afternoon" + firstName + lastName);
//		
//		ref1.greetUser("Satish" , "mahajan");
		
//		FunctionalInterface2 ref2 = (a,b)-> a+b;
	
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101,13000,"kavish"));
		empList.add(new Employee(102,4000,"satish"));
		empList.add(new Employee(103,15000,"kavi"));
		empList.add(new Employee(104,16000,"vish"));
		empList.add(new Employee(105,17000,"avishit"));
		empList.add(new Employee(106,18000,"shtish"));
		empList.add(new Employee(107,982000,"ishika"));
		empList.add(new Employee(108,187000,"avinish"));
		empList.add(new Employee(109,12100,"kavisha"));
		empList.add(new Employee(110,1221300,"avinabh"));
		empList.add(new Employee(111,12002,"vishaswas"));
		
//		Comparator<Employee> comparator = (cmp1,cmp2)->cmp1.getBasicSalary() - cmp2.getBasicSalary();
//		Collections.sort(empList, comparator);
//		
//		Collections.sort(empList,(e1,e2)-> e1.getBasicSalary() + e2.getBasicSalary());
//		
//		//print all employee whose name start with "K"
//		
////		printEmployeeDetails(empList,(e)->e.getEmpName().startsWith("K"));
//		
//		printEmployeeDetailsPredicate(empList,(employee)->employee.getEmpName().startsWith("K"));
//		
//		System.out.println("____________________________________________________");
//		
//		printEmployeeDetailsPredicate(empList,(employee)->{
//			if(employee.getBasicSalary()>10000)
//				return true;
//			else 
//				return false;
//		});
//	}
//	
//	private static void printEmployeeDetailsPredicate(List<Employee>empList,Predicate<Employee> condition) {
//		for(Employee employee:empList)
//			if(condition.test(employee))
//				System.out.println(employee);
//	}
//	
//	public static void callForWork(WorkService service) {
//		service.doSomeWork();
		
		Stream<Employee> stream1 = empList.stream();
		Stream<Employee> stream2 = stream1.distinct();
		Stream<Employee> stream3 = stream2.filter((employee)->employee.getEmpName().startsWith("K"));
		System.out.println(stream3.count());
		stream3.forEach(employee->System.out.println(employee));
		
		empList.stream().distinct().filter(employee->employee.getEmpName().startsWith("N"))
		.forEach(employee->System.out.println(employee));
		
		System.out.println(empList.stream().map(employee->employee.getBasicSalary()));
	}
	
}
