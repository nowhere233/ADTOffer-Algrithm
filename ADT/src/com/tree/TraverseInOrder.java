package com.tree;

import java.util.Stack;

import com.util.TNode;
import com.util.TREE;

/*
 * 树的中序遍历（非递归）
 */
public class TraverseInOrder {

	private Stack<TNode> stack = new Stack<TNode>();
	
	public void inOrderTraverseTree(TNode root) {
		if(root == null) return;
		TNode cur = root.left,node;
		stack.push(root);
		while(!stack.isEmpty() || cur != null) {
			if(cur != null) {
				stack.push(cur);
				cur = cur.left;
			}else {
				node = stack.pop();
				System.out.print(node.val + " ");
				cur = node.right;
			}
		}
	}
	
	public static void main(String[] args) {
		int a[] = new int[]{1,2,3,4,5,6,7};
		TNode root = TREE.BUILD_TREE(a);
		new TraverseInOrder().inOrderTraverseTree(root);
	}
	
}
