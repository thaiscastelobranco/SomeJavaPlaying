package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: " );
		employee.name = sc.nextLine();
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
				
		System.out.println("Employee: " + employee.name + " , $ " + employee.netSalary());
		double percentage = 0;
		System.out.println("Wich percentage to increase salary? ");
		percentage = sc.nextDouble();
		System.out.print("Updated data: " + employee.name);
		employee.increaseSalary(percentage);
		System.out.printf(" , $ %.2f", employee.netSalary()); 
		
		sc.close();
	}

}
