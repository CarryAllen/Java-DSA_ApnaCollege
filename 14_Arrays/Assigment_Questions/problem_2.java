/*

There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 0 
Output:   4 

Example 2:
Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 3
Output:   -1 
Example 3:
Input:nums = [1], target = 0
Output:   -1 

Constraints:
•1 <= nums . lengtth <= 5000 
•-10^4 <= nums [ i ] <= 10^4
•All values of nums are unique.
•nums is an ascending array that is possibly rotated.
•-10^4 <= target <= 10^4 

*/


public class problem_2 {
  public int search(int[] nums, int target) {

    //min value have index of minimum element of nums
    int min = minSearch(nums);

    //find in sorted left
    if(nums[min] <= target && target <= nums[nums.length-1]) {
      return search(nums, min, nums.length-1, target);
    }

    //find in sorted right
    else {
      return search (nums, 0, min, target);
    }
  }

  //binery search to find target in left to right boundry
  public int search(int[] nums, int left, int right, int target) {
    int l = left;
    int r = right;
    
    // System.out.println(left + " " + right);
    while (l <=r) {
      int mid = 1 + (r -1)/2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        r = mid -1;
      } else {
        l = mid + 1;
      }
    }
    return -1;
  }

  //smallest element index
  public static int minSearch(int[] nums) {
    int left = 0;
    int right = nums.length-1;

    while (left < right) {
      int mid = left + (right - left)/2;
      if(mid > 0 && nums[mid-1] > nums[mid]) {
        return mid;
      } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
        left = mid + 1;
      } else {
        right = mid -1;
      }
    }
    return left;
  }

  public static void main(String[] args) {
    problem_2 solution = new problem_2();

    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int target = 0;

    int result = solution.search(nums, target);
    System.out.println("Index of target element: " + result);
  }
}
  
