package ch2;
// 第三题
public class Cow extends Animal {

	static int initNum = 0;

	public Cow() {
		super();
		initNum ++;

	}
	public Cow(String name) {
		super(name);
		initNum ++;

	}
	public Cow(String name, String color) {
		super(name, color);
		initNum ++;

	}
	public String getSound(){
		return "mou mou mou";
	}
	/*
	// 2.第三题
	public void shout() {
		System.out.println("my name is " + name + ", mou mou mou" );
	}
	 */
	public static int getInitNum() {
		return initNum;
	}
}
