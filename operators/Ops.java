package operators;

public class Ops {
    public static void main(String[] args) {

        System.out.println("---- Lets Learn Operators ----");

        int i = 10;

        System.out.println("i++ : " + (i++));
        System.out.println("++i : " + (++i));
        System.out.println("--i : " + (--i));

        System.out.println("i == 10 : " + (i == 10));
        System.out.println("i > 10 : " + (i > 10));
        System.out.println("i >= 10 : " + (i >= 10));
        System.out.println("i < 10 : " + (i < 10));
        System.out.println("i <= 10 : " + (i <= 10));

        System.out.println("i & 10 : " + (i & 10));
        System.out.println("i | 10 : " + (i | 10));

        System.out.println("(i > 10) && (i <= 100)) : " + ((i > 10) && (i <= 100)));
        System.out.println("((i > 10) || (i <= 100)) : " + ((i > 10) || (i <= 100)));

        System.out.println("i = i + 1 : " + (i = i + 1));
        System.out.println("i = i + 5 : " + (i = i + 5));
        System.out.println("i += 5 : " + (i += 5));
        System.out.println("i *= 5 : " + (i *= 5));
        System.out.println("i /= 5 : " + (i /= 5));
        System.out.println("i -= 5 : " + (i -= 5));

        System.out.println("i > 5 ? okay : hi" + (i > 5 ? "Okay" : "hi"));
    }
}
