package com.dynamicProgram;

/*
 * 动态规划--最优编辑
 * 给定字符串A,B，增加、删除、替换一个字符的代价分别为ca、cd、cr,将字符串A通过这三种操作以最小代价转化成B 
 * eg：将"abce"转化成“abcf” 
 */
public class BestEditString {
	
	public static int findMinCost(String A, int n, String B, int m, int ca, int cd, int cr) {
		  int[][] dp = new int[300][300]; //dp[i][j] 代表将从A[0]-->A[i-1]的字符串转化成 B[0]-->B[i-1]的字符串最小代价
		  for (int i = 0; i < n + 1; i++)
		  {
			  dp[i] = new int[m + 1];
		  }
		  //初始化矩阵
		  dp[0][0] = 0;
		  for (int j = 1; j < m + 1; j++)
		  {
			  dp[0][j] =ca * j ;//A从空串转化成B[]
		  }
		  for (int i = 1; i< n + 1; i++)
		  { 
			  dp[i][0] = cd * i;//不能承载重量时，则不能装物体
		  }
		  for (int i = 1; i < n + 1; i++)
		  {
			  for (int j = 1; j < m + 1; j++)
			  { 
				  if (A.charAt(i-1) == B.charAt(i-1))
					  dp[i][j] = dp[i - 1][j - 1];
				  else
				  {
					  dp[i][j] = Math.min(dp[i][j - 1] + ca, cd + dp[i - 1][j]);
					  dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + cr);
				  }
			  }
		  }
		  return dp[n][m];
	  }
	
	public static void main(String[] args) {
		String a = "abc",b = "adc";
		int cost = findMinCost(a,3,b,3,3,5,3);
		System.out.println(cost);
	}
	
}
