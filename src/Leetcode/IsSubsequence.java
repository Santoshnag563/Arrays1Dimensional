package Leetcode;

/*
392. Is Subsequence

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false


Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
 */

/*
Solution: Two Pointer Approach
    Step 1: create right and left pointers and one int variable count
    Step 2: if s length is <= 0 return true;
    Step 3: iterate t string and check if characters are same
    Step 4: if characters are same increment both right and left + count as well, else increment only left
 */

public class IsSubsequence {

    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {


        int right = 0;
        int left = 0;
        int count = 0;

        if(s.length()<= 0)
            return true;

        for(int i = 0; i < t.length(); i++) {
            if(right<s.length()) {
                if(s.charAt(right) == t.charAt(left)) {
                    right++;
                    left++;
                    count++;
                } else  {
                    left++;
                }
            }
        }

        if(count == s.length())
            return true;
        else
            return false;

    }
}
