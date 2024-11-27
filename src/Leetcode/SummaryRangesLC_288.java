package Leetcode;

/*
228. Summary Ranges
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b


Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"


Constraints:

0 <= nums.length <= 20
-231 <= nums[i] <= 231 - 1
All the values of nums are unique.
nums is sorted in ascending order.
 */

/*
Solution:
1. loop the nums by initializing start value with nums[i]
2. compare current value index and next value index are same, if same increment i check for next values
3. if it breaks then append the string with start and current index value
4. increment i value
 */

import java.util.*;

public class SummaryRangesLC_288 {

    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,7};
        System.out.println(summaryRanges(arr));
    }

    public static List<String> summaryRanges(int[] nums) {




        List<String> aList = new ArrayList<String>();

        int i = 0;

        while(i<nums.length) {

            int start = nums[i];

            while(i+1 < nums.length && nums[i]+1 == nums[i+1])
                i++;

            if (start != nums[i]) {
                aList.add(start + "->" + nums[i]);
            } else {
                aList.add(start + "");
            }

            i++;


        }

        return aList;

    }
}
