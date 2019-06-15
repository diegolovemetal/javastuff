import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileCharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("/home/diego/IdeaProjects/JAVAStuff/src/characterInput.txt");
            out = new FileWriter("/home/diego/IdeaProjects/JAVAStuff/src/characterOutput.txt");

            int c;
            while ((c=in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
