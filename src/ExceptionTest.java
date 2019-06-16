import java.io.*;

public class ExceptionTest {
    public static void main(String[] args) {
//        File file = new File("/home/diego/IdeaProjects/JAVAStuff/src/ExceptionTes");
//        FileReader fr = new FileReader(file);
//        try {
//            int a [] = new int[2];
//            System.out.println("Access element a[3]" + a[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception thrown " +e);
//        }
//        System.out.println("Out of the block");
//        try {
//            FileInputStream file = new FileInputStream("sukablyat");
//            byte x = (byte)file.read();
//        } catch (IOException i) {
//            i.printStackTrace();
//        }
        int[] a = new int[2];
        try {
            System.out.println("Access element three " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown " + e);
        } finally {
            a[0] = 6;
            System.out.println("a[0]=" + a[0]);
            System.out.println("the finally statement is executed");
        }
        
    }
}
