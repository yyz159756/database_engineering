package ch1;


public class Cat {

	private String name = "";
	private String color = "";
	private int shoutNum = 1;

	static int initNum = 0;

	/*
	// 第三题
	public Cat() {
		this.shout();
	}

	// 第三题
	public Cat(String name) {
		this.name = name;
		this.shout();

	}
	/*第三题
	 public void shout() {
		System.out.println("my name is " + name + ", mewo" );
	}
	 *
	// 第四题
	public Cat(String name, String color) {
		this.name = name;
		this.color = color;
		this.shout();
	}
	*/

	// 第六题
	public Cat() {
		this.shout();
		initNum ++;
	}
	public Cat(String name) {
		this.name = name;
		this.shout();
		initNum ++;
	}
	public Cat(String name, String color) {
		this.name = name;
		this.color = color;
		this.shout();
		initNum ++;
	}

	public static int getInitNum() {
		return initNum;
	}


	//第五题
	public void shout() {
		
		System.out.print("my name is " + name);
		for(int i=0; i < getShoutNum(); i++){
			System.out.print(", mewo");
		}
		System.out.println("");
	}
	public void setShoutNum(int num) {
		if(num <= 10) {
			System.out.println("set shoutNum to " + num);
			this.shoutNum = num;
		}else {
			System.out.println("set , but max num is 10");
			this.shoutNum = 10;
		}
	}
	public int getShoutNum() {
		return this.shoutNum;
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat("jack");
		cat.setShoutNum(11);
		cat.shout();
		Cat cat2 = new Cat("lina");
		Cat cat3 = new Cat("lex");
		System.out.println("init num is " + Cat.getInitNum());
	}	

}

