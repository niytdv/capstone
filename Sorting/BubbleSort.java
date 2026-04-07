public class BubbleSort {

    public static void bubblesort(int[] arr){

        int n = arr.length;

        for(int i = 0; i < n - 1; i++){

            boolean swapped = false;

            for(int j = 0; j < n - i - 1; j++){

                if(arr[j] > arr[j + 1]){

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if(!swapped) break;
        }
    }

    public static void main(String[] args) {

        int[] arr = {3,2,4,1,5};

        bubblesort(arr);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}