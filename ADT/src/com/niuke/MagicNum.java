package com.niuke;

import java.util.Scanner;

/*
 * 小易拥有一个拥有魔力的手环上面有n个数字(构成一个环),当这个魔力手环每次使用魔力的时候就会发生一种奇特的变化：每个数字会变成自己跟后面一个数字的和(最后一个数字的后面一个数字是第一个),一旦某个位置的数字大于等于100就马上对100取模(比如某个位置变为103,就会自动变为3).现在给出这个魔力手环的构成，请你计算出使用k次魔力之后魔力手环的状态。 
 *输入描述:
 *输入数据包括两行：
 *第一行为两个整数n(2 ≤ n ≤ 50)和k(1 ≤ k ≤ 2000000000),以空格分隔
 *第二行为魔力手环初始的n个数，以空格分隔。范围都在0至99.
 *输出描述:
 *输出魔力手环使用k次之后的状态，以空格分隔，行末无空格。

 *输入例子1:
 *3 2
 *1 2 3

 *输出例子1:
 *8 9 7
 */
public class MagicNum {
	public static void main(String[] args) {
		int n,k,tmp;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int nums[] = new int[n];
		k = scan.nextInt();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		
		for (int i = 0; i < k; i++) {
			tmp = nums[0];
			for (int j = 0; j < nums.length; j++) {
				if(j == n - 1){
					nums[j] = nums[j] + tmp;
				}else {
					nums[j] = nums[j] + nums[j+1];
				}
				if(nums[j] >= 100)
					nums[j] %= 100; 
			} 
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(i != n-1){
				System.out.print(nums[i] + " ");
			}else {
				System.out.print(nums[i]);
			}
		}
		
	}
}
