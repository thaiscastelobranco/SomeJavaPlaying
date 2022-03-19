package entities;

public class Student {
	public String name;
	public double grade1, grade2, grade3, totalGrade;

	public String finalGrade() {
		this.totalGrade = grade1 + grade2 + grade3;
		return "FINAL GRADE = " + this.totalGrade;
	}

	public void passOrFailed() {
		if (this.totalGrade > 60) {
			System.out.println("PASS");
		} 
		else {
			System.out.println("FAILED"); 
			System.out.printf("MISSING %.2f ", 60 - this.totalGrade); 
			System.out.print("POINTS");
		}
	}
	
	

}
