package ua.lviv.lgsa.enimal;

public class Application {
	public static void main(String[] args) {
		
		Enimal en = new Enimal("Леопард", 20, 7);
		
		System.out.println(en.toString());
		
		en.setName("Бик");
		en.setSpeed(2);
		en.setAge(14);
		
		System.out.println(en.toString());
		
		
		
	}

}
