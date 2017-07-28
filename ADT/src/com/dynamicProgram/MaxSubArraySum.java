package com.dynamicProgram;

import java.util.Scanner;

/*
 * 一个数组有 N 个元素，求连续子数组的最大和。 例如：[-1,2,1]，和最大的连续子数组为[2,1]，其和为 3 
输入描述:
输入为两行。
第一行一个整数n(1 <= n <= 100000)，表示一共有n个元素
第二行为n个数，即每个元素,每个整数都在32位int范围内。以空格分隔。
输出描述:
所有连续子数组中和最大的值。
输入例子1:
3
-1 2 1
输出例子1:
3
 */
public class MaxSubArraySum {

	public static int maxSum(int a[],int n){
		//dp[i]表示数组中以a[i]为结尾的连续子串的最大值
		int dp[] = new int[n];
		int max = Integer.MIN_VALUE; 
		dp[0] = a[0];
		for (int i = 1; i < n; i++) {
		   dp[i] = Math.max(a[i], (dp[i-1] + a[i]));
		}
		
		for (int i = 0; i < n; i++) {
			   if(dp[i] > max)
				   max = dp[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt(); 
		}
		
		System.out.println(maxSum(a,n));
	}
}
