public class BreakTest {
    public static void main(String[] args) {
        String[] arr = {"B", "A", "I", "D", "U"};
        //如果删除break语句，程序的输出将没有任何差异。 对于此示例中的小型迭代，没有的性能问题。
        // 但是如果迭代器次数很大，那么它可以节省大量的处理时间。
        for(int len=0; len<arr.length; len++) {
            if (arr[len] == "A") {
                System.out.println("Array contains 'A' at index:" + len);
                break;
            }
        }

        int len = 0;
        while(len < arr.length) {
            if (arr[len] == "I") {
                System.out.println("Array contains 'I' at index:" + len);
                break;
            }
            len++;
        }

        len = 0;
        do {
            if (arr[len] == "D") {
                System.out.println("Array contains 'D' at index:" + len);
                break;
            }
            len++;
        } while (len < arr.length);


        int[][] array = {{1,2}, {3,4}, {11,12}, {10,8}};
        boolean found = false;
        int row = 0;
        int col = 0;
        //寻找第一个大于10的整数所在的索引值
        searchInt:
        for(row=0; row<array.length; row++){
            for(col=0; col<array[row].length; col++) {
                if (array[row][col] > 10) {
                    found = true;
                    break searchInt;
                }
            }
        }
        if (found) {
            System.out.println("First int greater than 10 is found at index:[" + row + ',' + col +"]");
        }
    }
}
