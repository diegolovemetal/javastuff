public class VarArgTest {
    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No arguments passed");
            return;
        }
        double result = numbers[0];

        for(int i=1; i<numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("Max= " + result);
    }
    public static void main(String[] args) {
        printMax();
        printMax(new double[]{1,2,3});
    }
}
