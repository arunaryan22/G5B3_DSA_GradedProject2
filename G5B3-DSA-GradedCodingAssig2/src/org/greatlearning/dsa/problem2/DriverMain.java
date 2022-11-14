package org.greatlearning.dsa.problem2;

import org.greatlearning.dsa.problem2.BSTmodify.Node;

public class DriverMain {
	// Driver Code
	public static void main(String[] args) {

		BSTmodify tree = new BSTmodify();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		int order = 0;
		tree.BSTToRSkewed(tree.node, order);
		tree.traverseRightSkewed(tree.headNode);
	}

}
