package levelone;

import java.util.Arrays;
import java.util.Scanner;
/*
https://www.interviewbit.com/problems/pick-from-both-sides/

Given an integer array A of size N.
You can pick B elements from either left or right end of the array A to get maximum sum.
Find and return this maximum possible sum.

NOTE: Suppose B = 4 and array A contains 10 elements then
You can pick first four elements or can pick last four elements or can pick 1 from front and 3 from back etc . you need to return the maximum possible sum of elements you can pick.

A = [5, -2, 3 , 1, 2]
B = 3
o/p  8
A = [1, 2]
B = 1
o/p  2
*/

public class PickFromBothSides {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome!");
        int[] arr = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println("B:");
        int B =  in.nextInt();
        int ans = solve(arr,B);
        System.out.println("Ans:"+ans);
        in.close();
    }
    /*Using prefix and postfix sum*/
    public static int solve(int[] A, int B) {
        int n = A.length;
        int[] prefixSum = new int[n];
        int[] postfixSum = new int[n+1];

        prefixSum[0]=A[0];
        postfixSum[n-1]=A[n-1];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+A[i];
        }
        for(int i=n-2;i>=0;i--){
            postfixSum[i]=postfixSum[i+1]+A[i];
        }

        int i=0, max=postfixSum[n-B];
        while(i<B){
            int right_ind = n-B+(i+1);
            max = Math.max(max, prefixSum[i] + postfixSum[right_ind]);
            i++;
        }
        return max;
    }

    public int solveUsingTwoPointer(int[] A, int B) {
        int size = A.length;
        int i=0, j=size-1;
        int leftSum=0, rightSum=0;

        while(i<B){
            leftSum+=A[i];i++;
        }
        i--;
        int max = leftSum;
        while(i>=0){
            leftSum-=A[i];
            rightSum+=A[j];
            max = Math.max(max, leftSum+rightSum);
            i--;j--;
        }
        return max;
    }
}
