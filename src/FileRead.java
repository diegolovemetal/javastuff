import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        File file = new File("Hello.txt");
        //创建一个新文件
        file.createNewFile();

        //创建一个filewriter对象
        FileWriter writer = new FileWriter(file);

        writer.write("This is an example");
        writer.flush();
        writer.close();

        //创建一个fileReader对象
        FileReader fr = new FileReader(file);
        char[] a = new char[50];
        fr.read(a);

        for(char c : a) {
            System.out.println(c);
        }
        fr.close();
    }
}
