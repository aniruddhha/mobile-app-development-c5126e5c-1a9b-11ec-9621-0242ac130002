package clsobj;

public class Calculator {

    public static int math = 0;

    private int num1; // state -> filed -> properties -> data
    private int num2;

    // special function = constructor
    public Calculator(int x, int y) { // used to inilize the state,
        // at the time of object creation
        num1 = x;
        num2 = y;
    }

    public void addition() {
        System.out.println("Addition Of Two Numbers is " + (num1 + num2));
    }

    public void substraction() {
        System.out.println("Substraction Of Two Numbers is " + (num1 - num2));
    }

    public void multiplication() {
        System.out.println("Multiplication Of Two Numbers is " + (num1 * num2));
    }

    public void division() {
        System.out.println("Division Of Two Numbers is " + (num1 / num2));
        // math = 10;
    }

    public static void pi() {
        math = 10;
        // num1 = 10;
    }
}
