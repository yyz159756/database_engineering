package ch1;

public class Dog {
	private String name = "";
	private String color = "";
	// ��һ��
	public Dog() {
		this.shout();
		
	}
	public Dog(String name) {
		this.name = name; 
		this.shout();
		
	}
	public Dog(String name, String color) {
		this.name = name; 
		this.color = color;
		this.shout();
	}
}
