package exr1;

public class Main {
    public static void main(String[] args) {

        MenuHelper helper = new MenuHelper();
        helper.showStartMenu();
        helper.performOperation(1);
        helper.performOperation(3);
        helper.performOperation(2);
    }
}
