public class FindInMatrix {
    public static boolean Find(int target, int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, cols = matrix[0].length;
        int r = 0, c = matrix[0].length - 1;        //从右上角开始

        while (r < rows-1 && c >= 0) {
            if (target == matrix[r][c]) {
                    return true;
            } else if (target > matrix[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,4,7,11,15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22},  {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}
        };
        boolean y = false;
        y = Find(6, matrix);
        if (y == false) {
            System.out.println("没有找到");
        } else {
            System.out.println("找到了");
        }
    }
}
