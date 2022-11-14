package org.greatlearning.dsa.problem2;


public class BSTmodify {

	// Class of the node
	static class Node {
		int data;
		Node left, right;

		// constructor to initialize the node data and left and right pointer
		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	// Function to flatten the binary search tree into a skewed tree in
	// increasing order
	static void BSTToRSkewed(Node root, int order) {

		// Base Case
		if (root == null) {
			return;
		}

		// Condition to check the order in which the skewed tree to maintained
		if (order > 0) {
			BSTToRSkewed(root.right, order);
		} else {
			BSTToRSkewed(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		// Condition to check if the root Node of the skewed tree is not defined
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		// Similarly recurse for the left / right subtree on the basis of the order required
		if (order > 0) {
			BSTToRSkewed(leftNode, order);
		} else {
			BSTToRSkewed(rightNode, order);
		}
	}

	// Traverse the right skewed tree u
	static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		traverseRightSkewed(root.right);
	}

	
}