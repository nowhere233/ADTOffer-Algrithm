package com.linklist;

import com.util.LINKLIST;
import com.util.LNode;

/*
 * 给定链表头指针head，将该链表逆序后返回头结点
 */
public class ReverseLinkList {
 
	public static LNode  reverseNoHead(LNode head) {
		if(head == null) return null;
		LNode cur = head.next,tmp;
		head.next = null;
		while(cur != null) {
			tmp = cur.next;
			cur.next = head;
			head = cur;
			cur = tmp;
		}
		return head;
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4};
		LNode head = LINKLIST.BUILD_LinkList(a);
		//LINKLIST.PRINT_List(head);
		head = ReverseLinkList.reverseNoHead(head);
		LINKLIST.PRINT_List(head);
	}
}
