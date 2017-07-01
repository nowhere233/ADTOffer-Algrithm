package com.tree;  
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.util.TNode;
import com.util.TREE;

/*
 * 以行为单位打印二叉树
 * 如:
 * 1
 * 2 3
 * 4 5
 */
public class PrintTreeGroupByLine {
	
	private List<List<Integer>> treeLineList = new ArrayList<List<Integer>>();
	private LinkedList<TNode> treeQue = new LinkedList<TNode>();
	
	public void printTreeByLine(TNode root) {
		if(root == null) return;
		TNode last = root,nlast = null;
		List<Integer> lineList = new ArrayList<Integer>();
		treeQue.add(root);
		while(!treeQue.isEmpty()){
			TNode node = treeQue.getFirst();
			lineList.add(node.val);
			treeQue.removeFirst();
			if(node.left != null) {
				nlast = node.left;
				treeQue.add(node.left);
			}
			if(node.right != null){
				nlast = node.right;
				treeQue.add(node.right);
			}
			if(node == last) {
				last = nlast;
				treeLineList.add(lineList);
				lineList = new ArrayList<Integer>();
			}
		}
		
		for (int i = 0; i < treeLineList.size(); i++) {
			System.out.print("(" + i + "): ");
			List<Integer> list = treeLineList.get(i);
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j) + "  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int a[] = new int[]{1,2,3,4,5,6};
		TNode root = TREE.BUILD_TREE(a);
		new PrintTreeGroupByLine().printTreeByLine(root);
	}
}
