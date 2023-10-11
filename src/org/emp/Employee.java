package org.emp;
import org.company.Company;
//child class
public class Employee extends Company{
	private void empName() {
		System.out.println("Employee Name : Manikandan");
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empName();
		e.companyName();
		e.clientName();
		e.projectName();
	}
	
}
