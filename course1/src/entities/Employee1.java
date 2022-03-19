package entities;

public class Employee1 {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee1(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double percentage) {
		this.salary = this.salary + (this.salary * percentage) / 100;
	}
	
	public String toString() {
		return id + " " + name + " " + salary;
	}
}
