import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ToUpperCase {
    public static void main(String[] args)throws IOException {
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream();

        while (bOutput.size() != 10) {
            //获取用户的输入
            bOutput.write("hello".getBytes());
        }

        byte b [] = bOutput.toByteArray();
        System.out.println("print the content");

        for (int x=0; x<b.length; x++) {
            //打印字符
            System.out.println((char)b[x] + "   ");
        }
        System.out.println("   ");

        int c;
        ByteArrayInputStream bInput = new ByteArrayInputStream(b);
        System.out.println("将字母转换成大写");

        for(int y=0; y<1; y++) {
            while ((c = bInput.read()) != -1) {
                System.out.println(Character.toUpperCase((char)c));
            }
            bInput.reset();
        }

    }
}
