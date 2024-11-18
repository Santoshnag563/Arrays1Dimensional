package Leetcode;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */

/* Solution:
Step 1: sort array list so that all the strings will be sorted and we can verify only first and last since all the elements will be sorted
Step 2: compare elements increment index
Step 3: if index > 0 return result string else return empty string
 */

import java.util.Arrays;

public class LongestCommonPrefixLC_14 {

    public static void main(String[] args) {
        String[] arr = {"flower","flow","flightttttttt"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {

        int index = 0;

        if(strs.length<=1)
            return strs[0];

        Arrays.sort(strs);

        for(String str: strs) {
            System.out.println(str);
        }

        String commonEle = "";

        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i = 0; i< first.length(); i++) {
            if(first.charAt(i) == last.charAt(i)) {
                commonEle = commonEle+first.charAt(i);
                index++;
            } else break;

        }
        if(index > 0) {
            return commonEle;
        } else return "";

    }
}

/*
highly optimal solution

public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) return "";

        String pref = strs[0];
        int prefLen = pref.length();

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            while (prefLen > s.length() || !pref.equals(s.substring(0, prefLen))) {
                prefLen--;
                if (prefLen == 0) {
                    return "";
                }
                pref = pref.substring(0, prefLen);
            }
        }

        return pref;




    }
 */
