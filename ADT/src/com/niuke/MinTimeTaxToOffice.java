package com.niuke;
  
import java.util.Scanner;

/*
 * 假设市区是一个无限大的区域，每条街道假设坐标是(X，Y)，小易当前在(0，0)街道，办公室在(gx,gy)街道上。小易周围有多个出租车打车点，小易赶去办公室有两种选择，一种就是走路去公司，另外一种就是走到一个出租车打车点，然后从打车点的位置坐出租车去公司。每次移动到相邻的街道(横向或者纵向)走路将会花费walkTime时间，打车将花费taxiTime时间。小易需要尽快赶到公司去，现在小易想知道他最快需要花费多少时间去公司。 
输入描述:
输入数据包括五行:
第一行为周围出租车打车点的个数n(1 ≤ n ≤ 50)

第二行为每个出租车打车点的横坐标tX[i] (-10000 ≤ tX[i] ≤ 10000)

第三行为每个出租车打车点的纵坐标tY[i] (-10000 ≤ tY[i] ≤ 10000)

第四行为办公室坐标gx,gy(-10000 ≤ gx,gy ≤ 10000),以空格分隔

第五行为走路时间walkTime(1 ≤ walkTime ≤ 1000)和taxiTime(1 ≤ taxiTime ≤ 1000),以空格分隔

输出描述:
输出一个整数表示，小易最快能赶到办公室的时间

输入例子1:
2
-2 -2
0 -2
-4 -2
15 3

输出例子1:
42
 */

public class MinTimeTaxToOffice {
	
	public static void main(String[] args) {
		int officeX,officeY;
		int taxiNum;
		int taxisX[],taxisY[];
		int walkTime,taxiTime;
		int toOfficeTime[];
		Scanner scan = new Scanner(System.in); 
		taxiNum = scan.nextInt();
		taxisX = new int[taxiNum];
		taxisY = new int[taxiNum];
		toOfficeTime = new int[taxiNum];
		for (int i = 0; i < taxiNum; i++) {
			taxisX[i] = scan.nextInt();
		}
		for (int i = 0; i < taxiNum; i++) {
			taxisY[i] = scan.nextInt();
		}
		officeX = scan.nextInt();
		officeY = scan.nextInt();
		walkTime = scan.nextInt();
		taxiTime = scan.nextInt();
		
		int walkITime,taxiITime,pureWalk;
		for (int i = 0; i < taxiNum; i++) {
			walkITime = (Math.abs(taxisX[i]) + Math.abs(taxisY[i])) * walkTime ;
			taxiITime = (Math.abs(taxisX[i] - officeX) + Math.abs(taxisY[i] - officeY)) * taxiTime;
			pureWalk = (Math.abs(officeX) + Math.abs(officeY)) * walkTime ;
			toOfficeTime[i] = walkITime + taxiITime;
			toOfficeTime[i] = pureWalk < toOfficeTime[i] ? pureWalk : toOfficeTime[i];
		}
		
		int minTime = toOfficeTime[0];
		for (int i = 1; i < toOfficeTime.length; i++) {
			if(toOfficeTime[i] < minTime)
				minTime = toOfficeTime[i];
		}
		System.out.println(minTime);
		
	}
	
}

