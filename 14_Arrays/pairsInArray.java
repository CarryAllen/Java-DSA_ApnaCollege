public class pairsInArray {
  public static void pairs(int[] nums) {
    int tp = 0;
    for (int i=0; i<nums.length; i++) {
      for (int j=i+1; j<nums.length; j++) {
          System.out.print(" (" + nums[i] + " , " + nums[j] + ") ");
          tp++;
        }
        System.out.println();
    }
    System.out.println("Total pairs: " + tp);
  }
  public static void main(String[] args) {
    int numebrs[] = {2,4,6,8,10};
    pairs(numebrs);
  }
}
