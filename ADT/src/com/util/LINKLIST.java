package com.util;

public class LINKLIST {

	public static TNode BUILD_LinkList(int listArray[]){
		TNode root = new TNode(listArray[0]);
		TNode pre = root,now;
		
		for (int i = 1; i < listArray.length; i++) {
			now = new TNode(listArray[i]);
			pre.next = now;
			pre = now;
		}
		 
		return root;
	}
	
	public static void PRINT_List(TNode head) {
		TNode cur = head;
		System.out.println("----------------------");
		if(head == null) System.out.println("空");
		while(cur != null) {
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
		System.out.println("\n----------------------");
	}
}
