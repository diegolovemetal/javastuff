import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";
    private static final String REGEX2 = "foo";
    private static final String INPUT2 = "foooooooooo";
    private static Pattern pattern2;
    private static Matcher mathcher2;
    private static String REGEX3 = "a*b";
    private static String INPUT3 = "aabfooaabfooabfoob";
    private static String REPLACE = "-";



    public static void main(String[] args) {
        // String to be scanned to find the pattern.
        String line = "This order was replaced for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";
        //Create a Pattern object
        Pattern p = Pattern.compile(pattern);
        //Now create matcher object
        Matcher m = p.matcher(line);
        if(m.find()) {
            System.out.println("Found value " + m.group(0));
            System.out.println("Found value " + m.group(1));
            System.out.println("Found value " + m.group(2));
            System.out.println("Found value " + m.group(3));
//            System.out.println("Found value " + m.group(4));
        } else {
            System.out.println("not matched");
        }

        Pattern p2 = Pattern.compile(REGEX);
        Matcher m2 = p2.matcher(INPUT);
        int count = 0;
        while(m2.find()) {
            count++;
            System.out.println("match number "+ count);
            System.out.println("Start():" + m2.start());
            System.out.println("End():" + m2.end());

        }

        pattern2 = Pattern.compile(REGEX2);
        mathcher2 = pattern2.matcher(INPUT2);

        System.out.println("Current Regex is "+REGEX2);
        System.out.println("Current Input is "+INPUT2);

        System.out.println("lookingAt(): "+mathcher2.lookingAt());
        System.out.println("matches(): "+mathcher2.matches());


        Pattern p3 = Pattern.compile(REGEX3);
        Matcher matcher3 = p3.matcher(INPUT3);
        StringBuffer s = new StringBuffer();
        while(matcher3.find()) {
            matcher3.appendReplacement(s, REPLACE);
        }
        matcher3.appendTail(s);
        System.out.println(s.toString());

    }
}
