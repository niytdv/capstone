public class BinarySearch {
    public static int binarysearch(int[] arr, int target){
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid =l+(h-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]<target) {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12,14};
        int target=10;
        System.out.println(binarysearch(arr,target));
    }
}
