public class Rotatearray {
    
    public static int[] rotateright(int[] nums,int k) {

        int n = nums.length;
        int[] arr = new int[n];

        k = k % n;

        int j = 0;

        for (int i = n - k; i < n; i++) {
            arr[j++] = nums[i];
        }

        for (int i = 0; i < n - k; i++) {
            arr[j++] = nums[i];
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] nums = {2,7,8,9,12,15};
        int k = 3;

        int[] result = rotateright(nums, k);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}