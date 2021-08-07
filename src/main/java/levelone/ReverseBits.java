package levelone;
/*
Problem Description

Reverse the bits of an 32 bit unsigned integer A.

Problem Constraints
0 <= A <= 232

Input Format
First and only argument of input contains an integer A.

Output Format
Return a single unsigned integer denoting the decimal value of reversed bits.


Input 1: 0
Input 2: 3

Output 1: 0
Output 2: 3221225472

Explanation 1:
        00000000000000000000000000000000
=>      00000000000000000000000000000000
Explanation 2:
        00000000000000000000000000000011
=>      11000000000000000000000000000000
 */

import java.util.Scanner;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        System.out.println("ans:"+reverse(num));
    }
    public static long reverse(long a) {
        long reverse=0;
        for(int i=0;i<32;i++){
            if((1 & a) == 1)
                reverse |= 1L << 32-i-1;
            a=a>>1;
        }
        return reverse;
    }
}
