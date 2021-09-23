package clsobj;

public class Main {

    public static void main(String[] args) {

        Mouse ms = new Mouse();
        ms.move(56, 89);
        ms.move(12, 100);
        ms.move(5, 78);
        ms.move(23, 42);
        // ms.calcSensorDelay();

        // ms.x = 10; // state should be accessible by means of behaviour only
        // ms.y = 60;

        ms.setX(10);
        ms.setY(50);
        int x = ms.getX();
        int y = ms.getY();

        System.out.println(" X = " + x + " Y = " + y);

        Animal an = new Tiger(); // tiger is having properties of animal as well Tiger
        an.walk();
        an.position(10.26, 6.35);
        // polymorphism

        Animal ct = new Cat();
        ct.walk();
        ct.blink();
        // ct.jump(); // it will allow you to call methods from referenced class

        Jungle jng = new Jungle();

        Calculator cl = new Calculator(10, 10);
        cl.addition(); // instance methods
        cl.division();
        cl.substraction();
        cl.multiplication();

        // -> num1 and num2 will be created everytime
        new Calculator(145, 3);
        // -> num1 and num2 will be created everytime
        new Calculator(146, 54);
        // -> num1 and num2 will be created everytime
        new Calculator(105, 5);
        // -> num1 and num2 will be created everytime
        new Calculator(1056, 164);

        Calculator.pi(); // class methods
        Calculator.math = 50; // math will be created only once
    }
}
