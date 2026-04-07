import java.util.Stack;

public class NextGreater {

    public static int[] nxtgtr(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] arr = new int[n];

        for(int i = n - 1; i >= 0; i--) {

            while(!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                arr[i] = -1;
            } 
            else {
                arr[i] = stack.peek();
            }

            stack.push(nums[i]);
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,4,1,2};
        int[] result = nxtgtr(nums);

        for(int x : result){
            System.out.print(x + " ");
        }
    }
}