package files;

import java.io.File;
import java.io.FileOutputStream;

public class Fl { // bad class name

    public static void write() { // there is huge scope for optimzation, but that is not our concern now
        try {
            File file = new File("./my.txt"); // referred the file
            FileOutputStream fos = new FileOutputStream(file); // open for writting
            String dt = "hello world";
            fos.write(dt.getBytes()); // actual write operation
            fos.close();// releasing the resource // code is not optimized, can done lateron
        } catch (Exception e) {
            System.out.println("Got Some Error");
        }
    }

    public static void main(String[] args) {
        write();
    }
}
