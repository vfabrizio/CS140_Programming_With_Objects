package assignment01;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestBUCourse1 {
    public static void main(String[] args) throws IOException, 
        ClassNotFoundException {

        int level100 = 0;
        int level200 = 0;

        BUCourse1 crs = null;
        try (FileInputStream inStream = new FileInputStream("courses.objs");) {
            ObjectInputStream objInStream = new ObjectInputStream(inStream);
            while(true) {
                crs = (BUCourse1)objInStream.readObject();
                if (crs != null) {
                    System.out.println(crs.getCrs() + " " + crs.getTitle());
                    if (crs.getCrs().charAt(0) == '1') {
                        level100 += 1;
                    }
                    else if (crs.getCrs().charAt(0) == '2') {
                        level200 += 1;
                    }
                }
            }

        } catch(IOException ex) {
                System.out.println("Number of 100-level courses = " + level100);
                System.out.println("Number of 200-level courses = " + level200);
        }
    }
}