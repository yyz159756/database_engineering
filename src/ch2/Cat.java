package ch2;

public class Cat extends Animal implements CatchMouse {



	/*ch1
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

    static int initNum = 0;

    public Cat() {
        super();
        initNum ++;

    }

    public Cat(String name) {
        super(name);
        shout();
        initNum ++;

    }

    public Cat(String name, String color) {
        super(name, color);
        shout();
        initNum ++;

    }

    public static int getInitNum() {
        return initNum;
    }

    // 2.3
    public String getSound(){
        return "miao miao miao";
    }
    /*
    //1.第五题
    public void shout() {

        System.out.print("my name is " + name);
        for (int i = 0; i < getShoutNum(); i++) {
            System.out.print(", mewo");
        }
        System.out.println("");
    }
     */

    public void setShoutNum(int num) {
        if (num <= 10) {
            System.out.println("set shoutNum to " + num);
            this.shoutNum = num;
        } else {
            System.out.println("set , but max num is 10");
            this.shoutNum = 10;
        }
    }

    public int getShoutNum() {
        return this.shoutNum;
    }

    public static void main(String[] args) {
        Animal cat = new Cat("jack");
        Animal cat2 = new Cat("lina");
        Animal cow = new Cow("tian");
        System.out.println(Cat.getInitNum());
    }

    @Override
    public void catchMouse() {
        System.out.println("cat catch mouse");
    }
}

