package BosscoderAssignments;

/*Given the array nums consisting of n(n will be even) elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].*/

/*
Input 1: nums = [2,5,1,3,4,7]
Output 1: [2,3,5,4,1,7]
Explanation 1: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

Input 2: nums = [1,2,3,4,4,3,2,1]
Output 2: [1,4,2,3,3,2,4,1]
*/

/* SOLUTION::
*  Step 1: create a new array of same length of input size
*  Step 2: create local variable j = 0; for indexing new array
*  Step 3: iterate array with its length and store elements based on tupe of shuffling
*
* */

public class ShuffleArray {

    public static void main(String[] args) {
        int[] input = {2,5,1,3,4,7};

        int[] output = shuffle(input);

        for(int i = 0; i< output.length; i++) {
            System.out.println(output[i]);
        }
    }

    static int[] shuffle(int[]  input){
        int mid = input.length/2;
        int[] newArray = new int[input.length];
        int j = 0;
        for(int i = 0; i<input.length/2; i++) {
            newArray[j] = input[i];
            j = j + 1;
            newArray[j] = input[mid+i]; // 2 3 1
            j++;
        }
        return newArray;
    }
}
