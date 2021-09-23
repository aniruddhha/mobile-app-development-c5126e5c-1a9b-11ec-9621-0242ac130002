package clsobj;

public class Cat extends Animal {

    private Jungle jungle; // this can can found in only one jungle

    private double jump;

    public void walk() {
        System.out.println("Cat is walking");
    }

    public void blink() {
        System.out.println("Cat is blinking eyes");
    }

    public void jump() {
        System.out.println("Cat is Jumping");
    }
}
