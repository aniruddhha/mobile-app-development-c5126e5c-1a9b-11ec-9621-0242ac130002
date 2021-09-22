package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Fl { // bad class name

    public static void write() { // there is huge scope for optimzation, but that is not our concern now
        System.out.println("----- Performing Write Operation -----");
        try {
            // code which might generate exception (error in general)
            File file = new File("./my.txt"); // referred the file
            FileOutputStream fos = new FileOutputStream(file); // open for writting
            String dt = "hello world";
            fos.write(dt.getBytes()); // actual write operation -bytes
            fos.close();// releasing the resource // code is not optimized, can done lateron
        } catch (Exception e) {
            System.out.println("Got Some Error");
        }

        System.out.println("----- Successfully Written ----- ");
    }

    public static void read() {
        System.out.println("----- Performing Read Operation -----");
        try {
            // code which might generate exception (error in general)
            File file = new File("./my.txt");
            FileInputStream fis = new FileInputStream(file);
            byte[] dt = fis.readAllBytes();
            String txt = new String(dt);
            System.out.println(txt);
            fis.close();
        } catch (Exception e) {
            System.out.println("Got Some Error");
        }
    }

    public static void main(String[] args) {
        write();

        read();
    }
}
