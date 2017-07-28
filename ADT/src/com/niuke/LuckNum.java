 
package com.niuke;

import java.util.Scanner;

/*
 * 现在对于一个数字x，小明同学定义出了两个函数f(x)和g(x)。 f(x)表示把x这个数用十进制写出后各个数位上的数字之和。如f(123)=1+2+3=6。
 *  g(x)表示把x这个数用二进制写出后各个数位上的数字之和。如123的二进制表示为1111011，那么，g(123)=1+1+1+1+0+1+1=6。 
 *  小明同学发现对于一些正整数x满足f(x)=g(x)，他把这种数称为幸运数，现在他想知道，小于等于n的幸运数有多少个？ 
 */
public class LuckNum {

	private static int result;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		int num = numLuck(n);
		 
		System.out.println(num);
	}
	public static int numLuck(int n){
		int num = 0;
		for (int i = 1; i <= n; i++) {
			String tenNum = String.valueOf(i); 
			
			int sum10 = 0;
			for (int j = 0; j < tenNum.length(); j++) {
				sum10 += tenNum.charAt(j) - '0';
			}
			 
			String binaryNum = Integer.toBinaryString(i); 
			
			int sum2 = 0;
			for (int j = 0; j < binaryNum.length(); j++) {
				sum2 += binaryNum.charAt(j) - '0';
			}
			if(sum2 == sum10){
//				System.out.print(num+1);
//				System.out.print("   "+i);
//				System.out.print("  decimalism: " + tenNum +" sum10:" + sum10+"---");
//				System.out.print("  binary: " + binaryNum +" sum2:" + sum2+"---");
//				System.out.println();
				num++;
			}
			
			
		}
		
		return num;
	}
	 
}

