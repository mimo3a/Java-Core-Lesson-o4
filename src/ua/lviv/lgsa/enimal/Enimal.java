package ua.lviv.lgsa.enimal;

public class Enimal {
	private String name;
	private int speed;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Enimal(String name, int speed, int age) {
		this.name = name;
		this.speed = speed;
		this.age = age;
	}
	
	public String toString() {
		return "Назва тварини" + " = " + '"' + this.getName() +'"' + ", " + 
		"Швидкість тварини" + " = " + this.getSpeed() + " км/год" + ", " + 
		"Вік тварини" + " = " + this.getAge() + " років";
	}

}
