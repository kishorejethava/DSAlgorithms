package levelone;

import util.Utility;

/*
* Problem Description

Given an array of integers A, every element appears twice except for one. Find that single one.
NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Problem Constraints
2 <= |A| <= 2000000
0 <= A[i] <= INTMAX

Input Format
First and only argument of input contains an integer array A.

Output Format
Return a single integer denoting the single element.

Example Input
Input 1:
 A = [1, 2, 2, 3, 1]
Input 2:
 A = [1, 2, 2]

Example Output
Output 1: 3
Output 2: 1
* */
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        int sum = singleNumber(Utility.readIntArr());
        System.out.println("sum:"+sum);
    }

    public static int singleNumber(final int[] A) {
        int sum=0;
        for (int j : A) {
            sum = sum ^ j;
        }
        return sum;
    }
}
