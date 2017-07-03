package com.util;

/*
 * 树的结点
 */
public class TNode {
	public int val;
	public TNode left;
	public TNode right;
	public int height; //树的高度
	
	public TNode(int val) { 
		this(val,null,null);
	}
	
	public TNode(int val, TNode left, TNode right) {
		super();
		this.val = val;
		this.left = left;
		this.right = right;
		this.height = 0;
	}
	
}
