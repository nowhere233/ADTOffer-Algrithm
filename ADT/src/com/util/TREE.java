package com.util;

/*
 * 二叉树相关操作
 */
public class TREE {
	private static int[] treeArray;
	
	/**
	 * 创建一颗二叉树
	 * @param a 树中结点值数组
	 * @return 树的根节点
	 */
	public static TNode BUILD_TREE(int a[]) {
		TNode root = null;
		treeArray = a;
		root = buildTree(0);
		return root;
	}
	/*
	 * 递归创建一颗子树
	 */
	public static TNode buildTree(int index) {
		TNode childRoot = null;
		if (index >= treeArray.length)  return null;
		childRoot = new TNode(treeArray[index]);
		childRoot.left = buildTree(2 * index + 1);
		childRoot.right = buildTree(2 * index + 2);
		return childRoot;
	}
	
	
	
}
