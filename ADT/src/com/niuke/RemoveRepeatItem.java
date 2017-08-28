package com.niuke;
 
import java.util.Iterator;
import java.util.LinkedHashSet; 
import java.util.Scanner;

public class RemoveRepeatItem {
	public static void main(String[] args) { 
		LinkedHashSet<Integer> noReSet = new LinkedHashSet<Integer>();
		Scanner scan = new Scanner(System.in); 
		int num = scan.nextInt(); 
		int a[] = new int[num],x;
		for (int i = 0; i < num; i++) {
			x = scan.nextInt();
			if (noReSet.contains(x)) {
				noReSet.remove(x); 
			}
			noReSet.add(x); 
		}
		int size = noReSet.size(),i = 1;
		for (Iterator iterator = noReSet.iterator(); iterator.hasNext();i++) {
			Integer integer = (Integer) iterator.next();
			if(i != size){
				System.out.print(integer + " ");
			}else {
				System.out.print(integer);
			}
		}
		 
		
	}
}
