package ch2;
// 第三题
public class Sheep extends Animal {

	static int initNum = 0;

	public Sheep() {
		super();
		initNum ++;

	}
	public Sheep(String name) {
		super(name);
		initNum ++;

	}
	public Sheep(String name, String color) {
		super(name, color);
		initNum ++;

	}
	public String getSound(){
		return "mie mie mie ";
	}
	/*
	// 2.第三题
	public void shout() {
		System.out.println("my name is " + name + ", mie mie mie" );
	}

	 */
	public static int getInitNum() {
		return initNum;
	}
}
