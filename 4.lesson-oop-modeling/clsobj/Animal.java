package clsobj;

public abstract class Animal implements GpsCollar {

    private int legs;
    private int eyes;
    // private double lat;
    // private double lng;

    public abstract void walk();

    public abstract void blink();

    // public void locate() {}

    public void position(double lat, double lng) {
        System.out.println(" Lat " + lat + " Lng " + lng);
    }
}
