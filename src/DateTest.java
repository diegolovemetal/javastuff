import java.util.*;
import java.text.*;



public class DateTest {
    public static void main(String[] args) {
        //实例化Date对象
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat datefmt = new SimpleDateFormat("yyyy.MM.dd(E)'at'hh:mm:ss a zzz");
        System.out.println("Current Date: " + datefmt.format(date));

        SimpleDateFormat datefmt2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("Current Date: " + datefmt2.format(date));

        String str = String.format("Current Date/Time %tc", date);
        System.out.println(str);

        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
        System.out.println();
        System.out.printf("%s %tB %<te, %<tY", "Due date", date);
        System.out.println();
        String input = args.length == 0 ? "2019-08-11" : args[0];
        System.out.println("解析为" + input );
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date t;
        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }

        try {
            System.out.println(new Date());
            Thread.sleep(3000);
            System.out.println(new Date());
        } catch (Exception e) {
            System.out.println("Got an exception");
        }
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date());

            Thread.sleep(3000);
            System.out.println(new Date());

            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("时间差为：" + diff + "ms");
        } catch (Exception e) {
            System.out.println("Got an exception");
        }
    }


}

