import java.io.*;

public class DataOutputStreamTest {
    public static void main(String[] args) throws IOException {
        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("/home/diego/IdeaProjects/JAVAStuff/src/test.txt"));
        // 使用 UTF-8 编码将字符串写入到文件中
        dataOut.writeUTF("Hello, DataOutPutSteam");

        DataInputStream dataIn = new DataInputStream(new FileInputStream("/home/diego/IdeaProjects/JAVAStuff/src/test.txt"));

        while (dataIn.available() > 0) {
            String str = dataIn.readUTF();
            System.out.println(str);
        }

    }
}
