package levelone;

import java.util.Scanner;

/*
Problem Description

Write a function that takes an integer and returns the number of 1 bits it has.

Problem Constraints
1 <= A <= 109

Input Format
First and only argument contains integer A

Output Format
Return an integer as the answer

Input: 11
Output: 3
ex: 1101 equivalent to 11 in number system
 */
public class NumberOf1Bits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("ans:"+numSetBits(in.nextLong()));
    }
    public static int numSetBits(long a) {
        int rem=0;
        while(a > 0){
            rem += a % 2;
            a=a/2;
        }
        return rem;
    }
}
