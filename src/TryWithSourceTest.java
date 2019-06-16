import java.io.FileReader;
import java.io.IOException;

public class TryWithSourceTest {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("/home/diego/IdeaProjects/JAVAStuff/src/test.txt")){
            char[] a = new char[50];
            fr.read(a);      // reads the contentto the array
            for (char c: a)
                System.out.print(c);    // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
