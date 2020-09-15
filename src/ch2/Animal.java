package ch2;

public abstract class Animal {
    String name = "";
    String color = "";
    int shoutNum = 1;
    static int initNum = 0;

    public Animal() {
        initNum++;
    }

    public Animal(String name) {
        this.name = name;
        initNum++;

    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        initNum++;

    }
    /*
    // 第二题
    public void shout() {
        System.out.println("");
    }*/
    //第三题
    public void shout() {
        System.out.printf("my name is %s, %s \n", name, getSound());
    }

    public static int getInitNum() {
        return initNum;
    }

    public abstract String getSound();
}