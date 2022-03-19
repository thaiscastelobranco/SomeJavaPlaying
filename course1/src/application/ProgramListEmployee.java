package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee1;

public class ProgramListEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
				
		List<Employee1> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			sc.nextLine();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee1(id, name, salary));
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		List<Employee1> result = list.stream()
				.filter(emp -> emp.getId() == id)
				.collect(Collectors.toList());
		
		if (!result.isEmpty()) {
			System.out.println("Enter the percentage:");
			double value = sc.nextDouble();
			result.get(0).increaseSalary(value);
		}
		
		System.out.println("List of employees: ");
		System.out.println(list);
		
		sc.close();
	}
}

