package com.tree;

import java.util.Stack;

import com.util.TNode;
import com.util.TREE;

/*
 * 树的先序遍历(非递归)
 */
public class TraversePreOrder {
	
	private Stack<TNode> stack = new Stack<TNode>();
	
	//先序遍历
	public void preTraverseTree(TNode root) {
		TNode node;
		stack.push(root);
		while(!stack.isEmpty()) {
			node = stack.pop();
			System.out.print(node.val + " ");
			if(node.right != null) {
				stack.push(node.right);
			} 
			if(node.left != null) {
				stack.push(node.left);
			}
		}
	}
	public static void main(String[] args) {
		int a[] = new int[]{1,2,3,4,5,6};
		TNode root = TREE.BUILD_TREE(a);
		new TraversePreOrder().preTraverseTree(root);
	}
	
}
