package BosscoderAssignments;

/*Given an integer array nums of length n, you want to create an array ans of length 2n
where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.*/

/*
Input 1: nums = [1,2,1]
Output 1: [1,2,1,1,2,1]
Explanation 1: The array ans is formed as follows:
        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
        - ans = [1,2,1,1,2,1]

Input 2: nums = [1,3,2,1]
Output 2: [1,3,2,1,1,3,2,1]
*/

/*
    Solution:
    Step 1: iterate input array
    Step 2: store values inside array if index < input.length and index > input.length
 */


public class ConcatnationOfArraay {

    public static void main(String[] args) {
        int[] input = {1,2,1};
        int[] output = solve(input);

        for(int i = 0; i< output.length; i++) {
            System.out.println(output[i]);
        }
    }

    static int[] solve(int[]  input){

        int newArraySize = input.length*2;
        int[] newArray = new int[newArraySize];
        int j = 0;

        for(int i = 0; i<newArraySize; i++) {
            if(i<input.length) {
                newArray[i] = input[i];
            }
            if(i >= input.length) {
                newArray[i] = input[j];
                j++;
            }
        }

        return newArray;

    }
}
