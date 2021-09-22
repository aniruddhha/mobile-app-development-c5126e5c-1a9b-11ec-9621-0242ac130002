package efficiency;

public class AlgoEff {

    public void constantTime() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Checking Constant Time"); // n = 100
        } // o(n) = o(100) = o(1)
    }

    public void logarithmicTime(int n) { // n = 100
        for (int i = 1; i < n; i *= 2) { // i = 1 * 2 = 2
                                         // i = 2 * 2 = 4
                                         // i = 8 * 2
            System.out.println("Checking Logarithmc Time");
        } // o(n) = O(log n)
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
