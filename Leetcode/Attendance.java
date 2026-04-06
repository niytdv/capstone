public class Attendance {
   
    public static int present(int[] nums) {
        int count=0;
        for (int i : nums) {
            if (i==1) {
                count++;
            }
            
        }
        
        return count; // fallback (though problem guarantees one solution)
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,0,1};

        int result = present(nums);

        System.out.println(result);
    }
}
