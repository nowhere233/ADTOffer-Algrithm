package com.util;

public class LINKLIST {

	public static LNode BUILD_LinkList(int listArray[]){
		LNode root = new LNode(listArray[0]);
		LNode pre = root,now;
		
		for (int i = 1; i < listArray.length; i++) {
			now = new LNode(listArray[i]);
			pre.next = now;
			pre = now;
		}
		 
		return root;
	}
	
	public static void PRINT_List(LNode head) {
		LNode cur = head;
		System.out.println("----------------------");
		if(head == null) System.out.println("空");
		while(cur != null) {
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
		System.out.println("\n----------------------");
	}
}

