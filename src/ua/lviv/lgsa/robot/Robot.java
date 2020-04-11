package ua.lviv.lgsa.robot;

public class Robot {

	public String robotType;
	public String robotWork;
	
	
	public Robot() {
		robotType = "Robot";
		robotWork = "Я просто працюю";
	}
	
	
	

	public void  work() {
	
		System.out.println(" Я " + robotType + " - " + robotWork);
		
	}

}
