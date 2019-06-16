import java.io.File;

public class DirTest {
    public static void main(String[] args) {
//        String dirname = "/home/diego/IdeaProjects/JAVAStuff/src/tmp/dirTest.txt";
//        File d = new File(dirname);
//        d.mkdirs();
//
        File file = null;
        String[] paths;

        try {
            file = new File("/home/diego/IdeaProjects/JAVAStuff/src");
            paths = file.list();

            for(String s: paths) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
