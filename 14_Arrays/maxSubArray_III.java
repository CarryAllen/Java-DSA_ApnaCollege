/* to imporve time complexity of program we are having this 3rd approach called Kadane's Algorithm */

public class maxSubArray_III {
  public static void maxSub_kandanes_Algo (int numbers[]) {

    int currSum = 0; 
    int maxSum = Integer.MIN_VALUE; 

    for (int i=0; i<numbers.length; i++) {
      currSum = currSum + numbers[i];
      if (currSum < 0) {
        currSum = 0;
      }
      maxSum = Math.max(currSum, maxSum);
    }
    System.out.println("Maximum SubArray by Kadane's Algorithm : " + maxSum);
  }

  public static void main(String[] args) {
    int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    maxSub_kandanes_Algo(numbers);
  }
}
