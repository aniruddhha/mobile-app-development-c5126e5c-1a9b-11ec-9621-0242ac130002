package generics;

import java.util.ArrayList;
import java.util.Optional;

public class Gen<T> {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("android");
        strings.add("ios");
        strings.add("linux");
        System.out.println(strings.toString());
    }
}
