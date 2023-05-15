public class Binary_Search {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;

            //comaparison
            if (numbers [mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 12;

        System.out.println("index value for "+ key + " is: " + binarySearch(numbers, key));
    }

}











/*

public static int binarySearch (int numbers[], int key) {
        int start=0, end = numbers.length-1;
        
        while(start <= end) {
            int mid = (start + end) / 2;

            //comaprison
            if (numbers [mid] == key) {     //found
                return mid;
            }
            if (numbers [mid] < key){       //right
                start = mid + 1;
            } else { //left
                end = mid - 1; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]  ={2,4,6,8,10,12,14,16};
        int key = 16;

        System.out.println("Index for key is: "+ binarySearch(numbers, key));
    }
<<<<<<< HEAD

*/
=======
}
>>>>>>> 130f7a79c13abe4eaf8627be2f583c5098cdf464
