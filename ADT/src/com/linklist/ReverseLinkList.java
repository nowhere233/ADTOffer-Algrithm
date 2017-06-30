package com.linklist;

import com.util.LINKLIST;
import com.util.TNode;

/*
 * 给定链表头指针head，将该链表逆序后返回头结点
 */
public class ReverseLinkList {
 
	public static TNode  reverseNoHead(TNode head) {
		if(head == null) return null;
		TNode cur = head.next,tmp;
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
		TNode head = LINKLIST.BUILD_LinkList(a);
		//LINKLIST.PRINT_List(head);
		head = ReverseLinkList.reverseNoHead(head);
		LINKLIST.PRINT_List(head);
	}
}
