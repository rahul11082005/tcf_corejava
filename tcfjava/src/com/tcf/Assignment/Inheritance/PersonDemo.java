package com.tcf.Assignment.Inheritance;

public class PersonDemo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("=== Student Details ===");
	        Student s1 = new Student("Kumar",37, 101,"Information Technology");
	        s1.display();
	        System.out.println("\n=== Research Student Details ===");
	        ResearchStudent rs1 = new ResearchStudent("Arun", 24, 201,"AI & ML","Natural Language Processing","Dr.Ramersh");
	        rs1.display();

	        System.out.println("\n=== Teacher Details ===");
	        Teacher t1 = new Teacher("Deepak",35, "T101", "Java Programming");
	        t1.display();
	}
}
