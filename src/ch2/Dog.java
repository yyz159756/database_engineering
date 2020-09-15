package ch2;

public class Dog extends Animal implements CatchMouse {

	static int initNum = 0;

	/*
	第一题
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
	*/
	//第二题
	public Dog() {
		super();
		initNum ++;

	}
	public Dog(String name) {
		super(name);
		initNum ++;

	}
	public Dog(String name, String color) {
		super(name, color);
		initNum ++;

	}
	public String getSound(){
		return "wang wang wang";
	}
	/*
	// 2.第一题 // 2.第三题
	public void shout() {
		System.out.println("my name is " + name + ", wang wang" );
	}

	 */
	public static int getInitNum() {
		return initNum;
	}

	@Override
	public void catchMouse() {
		System.out.println("dog catch mouse");
	}
}
