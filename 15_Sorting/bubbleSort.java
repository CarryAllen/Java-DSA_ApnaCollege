
public class bubbleSort {
    public static void bubblesort(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            // int swap = 0;
            for (int j=0; j<arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;    
                }
                // swap++;
            }
            // System.out.println("swap value is: " + swap);
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        bubblesort(arr);
        printArr(arr);
    }
}
