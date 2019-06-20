public class Duplicate {
    public static boolean duplicate(int[] nums, int length, int[] duplication) {
        if (nums == null || length <= 0) {
            return false;
        }
        for(int i=0; i<length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;

    }
    public static void main(String[] args) {
        int[] input = {2, 3, 1, 0, 2, 5};
        int[] output = new int[6];
        boolean y = false;
        y = duplicate(input, 6, output);
        if (y == false) {
            System.out.println("数组里没有重复的值");
        } else {
            System.out.println("重复的值是：" + output[0]);
        }
    }
}
