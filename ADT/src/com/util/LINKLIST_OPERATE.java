package com.util;

public class LINKLIST_OPERATE {

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
}
