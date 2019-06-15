public class MethodTest {
    public static int minFuction(int n1, int n2)  {
        int min;
        if (n1 > n2) {
            min = n2;
         } else {
            min = n1;
         }
        return min;
    }
    public static double minFuction(double n1, double n2)  {
        double min;
        if (n1 > n2) {
            min = n2;
         } else {
            min = n1;
         }
        return min;
    }

    public static void methodRank(double points) {
        if (points > 200.0) {
            System.out.println("Rank: A1");
        }else if (points > 100.0) {
            System.out.println("Rank: A2");
        }else {
            System.out.println("Rank: A3");
        }
    }
    public static void swapFuction(int a, int b) {
        System.out.println("before swapping(inside): a=" +a +" b=" +b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping(inside): a=" +a +" b=" +b);

    }

    public static void main(String[] args) {
//        int a = 123;
//        int b = 124;
////      int c = minFuction(a, b);
////      System.out.println("Min = " + c);
////      methodRank(a);
//        System.out.println("Before swapping: a=" + a + " b=" + b);
//        swapFuction(a, b);
//        System.out.println("Now, Before and After swapping values will be same here:");
//        System.out.println("After swapping, a=" + a + " b=" + b);
        for (int i=0; i<args.length; i++ ) {
            System.out.println("args[" + i +"]= " + args[i]);
        }

    }
}
