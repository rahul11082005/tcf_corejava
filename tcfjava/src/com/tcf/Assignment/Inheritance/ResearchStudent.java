package com.tcf.Assignment.Inheritance;

public class ResearchStudent extends Student{
	private String researchTopic;
    private String supervisorName;

    // Constructor chaining with super()
    public ResearchStudent(String name, int age, int rollNo, String course, String researchTopic2,
			String supervisorName2){
		// TODO Auto-generated constructor stub
    	super(name, age, rollNo, course); // Call Student constructor
        this.researchTopic = researchTopic;
        this.supervisorName = supervisorName;
	}

	// Overriding display method
    @Override
    public void display() {
        super.display();
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("Supervisor: " + supervisorName);
    }

}
