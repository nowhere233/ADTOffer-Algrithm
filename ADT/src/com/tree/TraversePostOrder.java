package com.tree;

import java.util.Stack;

import com.util.TNode;
import com.util.TREE;

/*
 * 树的后序遍历（非递归）
 */
public class TraversePostOrder {

	private Stack<TNode> stack = new Stack<TNode>();
	
	public void postTraverseTree(TNode root) {
		TNode cur = null,h = root;
		stack.push(root);
		while(!stack.isEmpty()) {
			cur = stack.peek();
			if(cur.left != h && cur.right != h && cur.left != null ) {
				stack.push(cur.left);
			}else if(cur.right != h && cur.right != null) {
				stack.push(cur.right);
			}else {
				stack.pop();
				System.out.print(cur.val + " ");
				h = cur;
			}
		}
	}
	
	public static void main(String[] args) {
		int a[] = new int[]{1,2,3,4,5,6,7};
		TNode root = TREE.BUILD_TREE(a);
		new TraversePostOrder().postTraverseTree(root);
	}
}
