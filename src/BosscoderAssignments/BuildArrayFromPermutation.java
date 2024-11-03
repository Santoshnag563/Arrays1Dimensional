package BosscoderAssignments;

/*Given a zero-based permutation nums (0-indexed), build an array ans of the same length where
ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).*/

/*
Input 1: nums = [0,2,1,5,3,4]
Output 1: [0,1,2,4,5,3]
Explanation 1: The array ans is built as follows:

ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]

ans = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]] = [0,1,2,4,5,3]

Input 2: nums = [5,0,1,2,3,4]
Output 2: [4,5,0,1,2,3]
*/

/*
 Solution::
   Step 1: create new array of same length and itreate input array
   Step 2: take the checkValue from permutation of input array
   Step 3: use this checkValue as index for storing final value into array
 */

public class BuildArrayFromPermutation {

    static int[] build(int[]  input){

        int[] newArray = new int[input.length];

        for(int i = 0; i< input.length; i++) {
            int checkValue = input[i];
            newArray[i] = input[checkValue];
        }

        return newArray;
    }
}
