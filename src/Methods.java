public class Methods {

    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 5;
        Short z = 5;
        Integer a = 10;
        System.out.println(x.compareTo(9));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(4));

        System.out.println(x.equals(a));
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));

        System.out.println(Integer.valueOf(9));
        System.out.println(Double.valueOf(5));
        System.out.println(Float.valueOf("80"));
        System.out.println(Integer.valueOf("444", 16));

        System.out.println(Integer.toString(123));

        System.out.println(Integer.parseInt("9"));
        System.out.println(Double.parseDouble("5.123"));
        System.out.println(Integer.parseInt("444", 16));

        System.out.println(Math.abs(-100.1));
        System.out.println(Math.ceil(12.4));
        System.out.println(Math.floor(12.3));
        System.out.println(Math.rint(12.3));
        System.out.println(Math.rint(12.7));
        System.out.println(Math.rint(12.5));
        System.out.println(Math.round(90f));
        System.out.println(Math.round(4214.21312));

        System.out.printf("the value of e is %.4f\n", Math.E);
        System.out.printf("exp(%.3f) is %.3f\n", 2.5, Math.exp(2.5));
        System.out.printf("log(%.3f) is %.3f\n", 2.5, Math.log(2.5));
        System.out.printf("Pow(%.3f, %.3f) is %.3f\n", 10.5, 2.0, Math.pow(10.5, 2.0));
        System.out.printf("sqrt(%.3f) is %.3f\n", 1.323, Math.sqrt(1.323));

        System.out.println(Character.isLetter('C'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toString('c'));

        String str1 = "Strings are immutable";
        String str2 = "Strings are immutable";
        String str3 = "Integers are not immutable";

        int result = str1.compareTo( str2 );
        System.out.println(result);

        result = str2.compareTo( str3 );
        System.out.println(result);

        result = str3.compareTo( str1 );
        System.out.println(result);




    }
}
