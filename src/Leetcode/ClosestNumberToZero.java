package Leetcode;

/*
2239. Find Closest Number to Zero

Given an integer array nums of size n, return the number with the value closest to 0 in nums. If there are multiple answers, return the number with the largest value.



Example 1:

Input: nums = [-4,-2,1,4,8]
Output: 1
Explanation:
The distance from -4 to 0 is |-4| = 4.
The distance from -2 to 0 is |-2| = 2.
The distance from 1 to 0 is |1| = 1.
The distance from 4 to 0 is |4| = 4.
The distance from 8 to 0 is |8| = 8.
Thus, the closest number to 0 in the array is 1.
Example 2:

Input: nums = [2,-1,1]
Output: 1
Explanation: 1 and -1 are both the closest numbers to 0, so 1 being larger is returned.


Constraints:

1 <= n <= 1000
-105 <= nums[i] <= 105
 */

/*
SOLUTION:
    Step 1: declare two variables with min(to check difference from 0) and res(to preserve sign of value)

    Step 2: iterate array and make condition

    Step 3: swap if condition satisfies

    Step 4: if both are same and nums[i]> res then this should we swapped according to problem statement
 */

public class ClosestNumberToZero {

    public static void main(String[] args) {
        int[] nums = {-4,-2,1,4,8};
        findClosestNumber(nums);
    }

    public static int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int res = 0;

        for(int i = 0; i< nums.length; i++) {
            if(Math.abs(nums[i])< min) {
                min = Math.abs(nums[i]);
                res = nums[i];
            }
        }
        return res;
    }
}
