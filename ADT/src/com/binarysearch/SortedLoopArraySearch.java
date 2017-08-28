package com.binarysearch;

import java.util.Arrays;

/*
 * Problem ：当前的数组是一个经过排序之后的循环有序数组， 查找给定的数的位置。
 *例如有序数组为：{1，2，3，4，5，6} 
 *其循环有序数组可能为： {3，4，5，6，1，2}、 {6，1，2，3，4，5}、{4，5，6，1，2，3}等
 *
 */
public class SortedLoopArraySearch {
	
	public static int rotatedArraySearch(int a[],int target) {
		int start = 0,end = a.length - 1;
		int mid;
		
		if(a[start] >  a[end]){ 	
			while(start <= end){
				mid = start + (end - start) / 2;
				if(a[mid] == target){
					return mid;
				}else if(a[mid] >= a[start]){
				    if(target > a[start] && target < a[mid]){
						end = mid - 1;
					}else {
						start = mid + 1;
					}
				}else{
					if(target < a[end] && target > a[mid]){
						start = mid + 1;
					}else{
						end = mid - 1;
					}
				}
			}
		}else{
			while(start <= end){
				mid = start + (end - start) / 2;
				if(a[mid] == target){
					return mid;
				}else if(a[mid] <= a[start]){
				    if(target < a[start] && target > a[mid]){
						end = mid - 1;
					}else {
						start = mid + 1;
					}
				}else{
					if(target > a[end] && target < a[mid]){
						start = mid + 1;
					}else{
						end = mid - 1;
					}
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int a[] = {6,8,9,10,12,13,0,1,4};
		int b[] = {4,1,0,13,12,10,9,8,6};
		int indexa = rotatedArraySearch(a, 13);
		int indexb = rotatedArraySearch(b, 13);
		System.out.println("Array a 'num is in:" + indexa);
		System.out.println("Array b 'num is in:" + indexb);
	}
}
