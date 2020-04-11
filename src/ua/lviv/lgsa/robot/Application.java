package ua.lviv.lgsa.robot;

public class Application {
	public static void main(String[] args) {
		Robot r = new Robot();
		r.work();
				
		CoffeRobot c = new CoffeRobot("","");
		c.work();
		
		RobotDancer d = new RobotDancer("","");
		d.work();
		
		RobotCoocker cooc = new RobotCoocker("","");
		cooc.work();
		
		Robot [] rob = new Robot[4];
		rob[0] = r;
		rob[1] = c;
		rob[2] = d;
		rob[3] = cooc;
		
		for(int i = 0; i <= 3; i++) {
			rob[i].work();
		}
	}

}
