package Leetcode;/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
        assert nums[i] == expectedNums[i];
        }
If all assertions pass, then your solution will be accepted.



        Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).


Constraints:

        1 <= nums.length <= 3 * 104
        -100 <= nums[i] <= 100
nums is sorted in non-decreasing order.*/

/*
Solution:
            Step 1: create hashset
            Step 2: iterate array and add each elements in set which automatically removes duplicates
            Step 3: iterate hashset and replace elements, return the size of hashSet
 */


import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesLC_26 {

    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i< nums.length; i++) {
            set.add(nums[i]);
        }
        int j = 0;
        for(int value: set) {
            nums[j] = value;
            j++;
        }



        return set.size();
    }

    public static void main(String[] args) {
        int count = 0;
        int[] nums = {1,1,2};
        for(int i = 0; i< nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                nums[i] = nums[i+1];
                System.out.println("Nums 0"+nums[0]+" Iteratin - "+i);
                System.out.println("Nums 1"+nums[1]+" Iteratin - "+i);
                System.out.println("Nums 1"+nums[2]+" Iteratin - "+i);
                count++;
            }

        } System.out.print("Count:: "+count);

    }
}
