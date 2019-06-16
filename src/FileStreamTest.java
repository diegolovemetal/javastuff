import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) {
        try {
            byte bWrite [] = {11, 21, 23, 32};
            OutputStream outs = new FileOutputStream("/home/diego/IdeaProjects/JAVAStuff/src/test.txt");
            for (int x=0; x<bWrite.length; x++) {
                outs.write(bWrite[x]); //write the bytes
            }
            outs.close();

            InputStream is = new FileInputStream("/home/diego/IdeaProjects/JAVAStuff/src/test.txt");
            int size = is.available();

            for (int i=0; i<size; i++) {
                System.out.println((char)is.read() + "  ");
                is.close();
            }
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}

