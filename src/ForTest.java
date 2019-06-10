import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForTest {
    public static void main(String[] args) {
        int[] intArray = { 10, 20, 30, 40, 50};
        for (int i : intArray) {
            System.out.println("Java for each loop with array :" + i);
        }

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");
        for (String s : fruits) {
            System.out.println("Java for each loop with collection :" + s);
        }

        int[][] intArr = {{1, 2, 3}, {0, -1}, {1, 3, -3}, {1, 2, 7}};
        process: for (int i = 0; i < intArr.length; i++) {
            boolean allPositive = true;
            for (int j = 0; j < intArr[i].length; j++) {
                if (intArr[i][j] < 0) {
                    allPositive = false;
                    continue process;
                }
            }
            if (allPositive) {
                //process the array
                System.out.println("Processing " + Arrays.toString(intArr[i]));
            }
        }
    }
}
