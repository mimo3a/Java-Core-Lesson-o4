package ua.lviv.lgsa.enimal;

public class Application {
	public static void main(String[] args) {
		
		Enimal en = new Enimal("�������", 20, 7);
		
		System.out.println(en.toString());
		
		en.setName("���");
		en.setSpeed(2);
		en.setAge(14);
		
		System.out.println(en.toString());
		
		
		
	}

}
