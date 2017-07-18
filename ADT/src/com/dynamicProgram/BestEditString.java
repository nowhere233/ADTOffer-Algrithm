package com.dynamicProgram;

/*
 * 动态规划--最优编辑
 * 给定字符串A,B，增加、删除、替换一个字符的代价分别为ca、cd、cr,将字符串A通过这三种操作以最小代价转化成B 
 * eg：将"abce"转化成“abcf” 
 */
public class BestEditString {
	
	public static int findMinCost(String A, int n, String B, int m, int ca, int cd, int cr) {
		  int[][] dp = new int[300][300];
		  for (int i = 0; i < n + 1; i++)
		  {
			  dp[i] = new int[m + 1];
		  }
		  //初始化矩阵
		  dp[0][0] = 0;
		  for (int i = 1; i < m + 1; i++)
		  {
			  dp[0][i] =ca*i ;//没有装入物体时，就没有价值了
		  }
		  for (int j = 1; j< n + 1; j++)
		  {
			  dp[j][0] = cd*j;//不能承载重量时，则不能装物体
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
