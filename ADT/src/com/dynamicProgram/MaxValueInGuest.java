package com.dynamicProgram;

import java.util.Scanner;

/*
 * 某餐馆有n张桌子，每张桌子有一个参数：a 可容纳的最大人数； 有m批客人，每批客人有两个参数:b人数，c预计消费金额。
 *  在不允许拼桌的情况下，请实现一个算法选择其中一部分客人，使得总预计消费金额最大 
 */
public class MaxValueInGuest {

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
