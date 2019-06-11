public class ListTest {
    public static void main(String[] args) {
        //print
        double[] myList = {11.2, 12.3, 23, 123, 123.3};
        for(int i=0; i<myList.length; i++) {
            System.out.printf(myList[i] + " ");
        }
        System.out.println(" ");
        //sum
        double sum = 0;
        for(int i=0; i<myList.length; i++) {
            sum += myList[i];
        }
        System.out.println("sum =" + sum);
        //max
        double max = myList[0];
        for(int i=1; i<myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.println("max=" + max);

        //foreach
        for(double element : myList) {
            System.out.print(element + ", ");
        }
        System.out.println(" ");
        printArray(myList);
        printArray(reverse(myList));
    }

    public static void printArray(double[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(" ");
    }

    public static double[] reverse(double[] list) {
        double[] result = new double[list.length];

        for(int i=0, j=result.length-1; i<list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}
