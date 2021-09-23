package clsobj;

public class Mouse {

    private int x; // state
    private int y;

    private int calcSensorDelay() { // abstraction -> hiding internal unwanted details and provoding required things
                                    // only
        return 3;
    }

    public void move(int a, int b) { // behaviour
        x = a + calcSensorDelay();
        y = b + calcSensorDelay();
    }

    public void setX(int a) {
        x = a;
    }

    public int getX() {
        return x;
    }

    public void setY(int b) {
        y = b;
    }

    public int getY() {
        return y;
    }
}
