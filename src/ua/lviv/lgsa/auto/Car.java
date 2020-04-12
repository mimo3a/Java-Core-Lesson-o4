package ua.lviv.lgsa.auto;

public class Car {
	private String marke;
	private String model;
	private int year;
	private Steering steering;
	private Wheel wheel;
	private Body body;
	
	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Car(String marke, String model, int year, Steering steering, Wheel wheel, Body body) {
		this.marke = marke;
		this.model = model;
		this.year = year;
		
		this.setSteering(steering);
		this.setWheel(wheel);
		this.setBody(body);
	}

	public String toString() {
		return "Car [marke=" + marke + ", model=" + model + ", year=" + year + ", steering=" + getSteering() + ", wheel="
				+ getWheel() + ", body=" + getBody() + "]";
	}

	public Steering getSteering() {
		return steering;
	}

	public void setSteering(Steering steering) {
		this.steering = steering;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}
	
	
	
	

}
