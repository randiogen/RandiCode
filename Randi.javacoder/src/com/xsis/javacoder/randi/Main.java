package com.xsis.javacoder.randi;

public class Main{

	Employee manager , director , employee , programmer;
	//Polimorphism
	/*public Employee manager2 = new Manager();
	public Employee director2 = new Director();
	public Employee programmer2 = new Programmer();
	public Employee employee2 = new Employee();*/
	
	public void inheritanceEx(){
		this.director = new Director();
		this.manager = new Manager();
		this.employee = new Employee();
		this.programmer = new Programmer();
	
		director.setSalary(5000.0);
		System.out.println("Salary Director : " + director.getSalary());
	}
	
	public static void main(String[] args) {
		/*Employee emp = new Employee(1,"Febriansyah","Chichago",5000.0);
		emp.info();*/
	
		//inheritance
		
		Main main = new Main();
		main.inheritanceEx();
		
	}
	
}
