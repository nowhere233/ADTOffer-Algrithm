package com.linklist;

import com.util.LINKLIST;
import com.util.LNode;

/*
 * 给定Num，将链表中大于Num的放在右边，小于num的结点放在num结点左侧
 */
public class ListSeprateByNum {
	
	public static LNode separateList(LNode head,int num) {
		if(head == null) return null;
		LNode leftHead = null,leftRear = null,numHead = null,numRear = null;
		LNode rightHead = null,rightRear = null;
		LNode cur = head,tmp,rear = null;
		while(cur != null) {
			tmp = cur.next;
			//处理大于num的结点放在右链表
			if(cur.val > num) {
				if(rightHead == null) {
					rightHead = rightRear= cur;
					rightRear.next = null; 
				}else { 
					rightRear.next = cur;
					rightRear = cur; 
					rightRear.next = null;
				}
			} 
			//处理大于num的结点放在右链表
			if(cur.val == num) {
				if(numHead == null) {
					numHead = numRear= cur;
					numRear.next = null; 
				}else { 
					numRear.next = cur;
					numRear = cur; 
					numRear.next = null;
				}
			}
			//处理大于num的结点放在右链表
			if(cur.val < num) {
				if(leftHead == null) {
					leftHead = leftRear= cur;
					leftRear.next = null; 
				}else { 
					leftRear.next = cur;
					leftRear = cur; 
					leftRear.next = null;
				}
			}
			cur = tmp;
		}
		LINKLIST.PRINT_List(leftHead);
		LINKLIST.PRINT_List(numHead);
		LINKLIST.PRINT_List(rightHead);
		if(leftRear != null) {
			head = leftHead;
			rear = leftRear;
		}
		
		if(rear != null) {
			if(numHead != null) {
				rear.next = numHead;
				rear = numRear;
			}
		}else {
			head = numHead;
			rear = numRear;
		}
		
		if(rear != null) {
			if(rightHead != null) {
				rear.next = rightHead;
				rear = rightRear;
			}
		}else {
			head = rightHead;
			rear = rightRear;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{3,8,1,4,2,5,9,10,6};
		LNode head = LINKLIST.BUILD_LinkList(a);
		//LINKLIST.PRINT_List(head);
		head = ListSeprateByNum.separateList(head, 5);
		LINKLIST.PRINT_List(head);
	}
	
}
