package clsobj;

import java.util.List;

public class Tiger extends Animal { // extends => Tiger is An Animal

    private List<Jungle> jungles; // this tiger can found in mutiple jungles

    private String type;

    public void walk() {
        System.out.println("Tiger is walking");
    }

    public void blink() {
        System.out.println("Tiger is blinking eyes");
    }
}
