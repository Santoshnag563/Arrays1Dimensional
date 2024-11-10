package Leetcode;

/*
1768 . Merge String Alternatively

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.



Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d


Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.
 */

/*
SOLUTION:
    Step 1: take the size of each strings and assign to one new variable of size based on sizes of two Strings
    Step 2: iterate and append the values of two strings
    Step 3: append the resulting string if the other is greater based on condition check
 */

public class MergeStringsAlternately {

    public static void main(String[] args) {

        String word1 = "ab";
        String word2 = "pqrs";

        String res = mergeAlternately(word1, word2);

         System.out.println(res);

        System.out.println(res.equals("apbqrs"));


    }

    public static String mergeAlternately(String word1, String word2) {

        int word1Size = word1.length();
        int word2Size = word2.length();
        int size = 0;
        StringBuilder res = new StringBuilder();

        if(word1Size > word2Size) {
            size = word2Size;
        } else if(word2Size > word1Size) {
            size = word1Size;
        } else {
            size = word1Size;
        }

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        for(int i = 0; i<size ; i++) {
            //System.out.println(word1Array[i]);
            res.append(word1Array[i]);
            res.append(word2Array[i]);
        }

        if(word1Size > word2Size) {
            res.append(word1.substring(word2Size,word1Size));
        } else if(word2Size > word1Size) {
            res.append(word2.substring(word1Size, word2Size));
        }

        return res.toString();

    }
}

/*
Alternate solution with more efficient run time 0 ms (zero ms)


public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int word1Length = word1.length();
        int word2Length = word2.length();
        int letterCount = word1Length > word2Length ? word1Length : word2Length;
        int count = 0;
        while (count < letterCount) {
            if (count < word1Length) {
                result.append(word1.charAt(count));
            }
            if (count < word2Length) {
                result.append(word2.charAt(count));
            }
            count++;
        }
        return result.toString();
    }
 */
