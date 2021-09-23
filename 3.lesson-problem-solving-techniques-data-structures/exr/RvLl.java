package exr;

public class RvLl {

    public static void printList(Node nd) { // nd2
        while (nd != null) { // nd2, nd1, nd is not null
            System.out.print(nd.data + " , "); // nd2s data, nd1s data, nds data
            nd = nd.next; // nd = nd2.next = nd1, nd = nd1.next = nd, nd = nd.next = null
        }
        System.out.println();
    }

    public static void reverseList(Node head) {
        
    }

    public static void reverse(Node nd) {

        String a = "android";
        String b = "ios";
        String c = "linux";
        String d = "windows";

        // a = windows, b = linux, c = ios, d = android

        String ta, tb = "";

        ta = a;
        tb = b;
        a = d;
        b = c;
        c = tb;
        d = ta;

        System.out.println(" a = " + a + " b = " + b + " c = " + c + " d = " + d);
    }

    public static void main(String[] args) {

        Node nd = new Node(); // you created linkedlist node
        nd.data = 100; // assigned data 10
        nd.next = null; // next of list is null
        // curre

        Node nd1 = new Node();
        nd1.data = 200;
        nd1.next = nd; // current = nd1, previous = nd2, next = current.next, current.next = next

        Node nd2 = new Node();
        nd2.data = 300;
        nd2.next = nd1; // current = nd2, previous = nd1, next = null, current.next = null

        printList(nd2);

        // next, previous, current

        // lets start from head

        Node tmp1 = null;
        tmp1 = nd2.next;

        nd2.next = null;

        nd1.next = nd2;

        nd.next = nd1;

        printList(nd);

    }
}