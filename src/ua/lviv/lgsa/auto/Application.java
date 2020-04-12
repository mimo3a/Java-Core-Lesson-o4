package ua.lviv.lgsa.auto;

public class Application {
	public static void main(String[] args) {
		
		Steering st = new Steering();
		st.setDiamSt(55);
		
		
		Wheel wh = new Wheel();
		wh.setSizeWheel(24);
		
		
		Body b = new Body();
		b.setBodycolor("Green");
		
		
		Car car = new Car("Ford", "Mustang", 1994, st, wh, b);
		System.out.println(car.toString());
		
		car.getSteering().setDiamSt(200);
		car.getWheel().setSizeWheel(25);
		car.getBody().setBodycolor("Black");
		
		car.setMarke("BmW");
		car.setModel("X5");
		car.setYear(2010);
		System.out.println(car.toString());
		
		
	}

}
