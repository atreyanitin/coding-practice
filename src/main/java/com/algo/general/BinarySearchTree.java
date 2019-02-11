package com.algo.general;

public class BinarySearchTree {
	Node root;

	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	private static int minDepth(Node root) {

		if (root.left == null && root.right == null)
			return 1; // leaf node

		if (root.left == null && root.right != null)
			return minDepth(root.right)+1;

		if (root.left != null && root.right == null)
			return minDepth(root.left)+1;

		else
			return Math.min(minDepth(root.left), minDepth(root.right)) + 1;

	}

	private static int maxDepth(Node root) {
		if (root.left == null && root.right == null) {
			System.out.println(root.data + " << both null");
			return 1; // leaf node

		}

		if (root.left == null && root.right != null) {
			int n = maxDepth(root.right) +1;
			System.out.println(root.data + " << left null = " + n);
			return  n ;

		}

		if (root.left != null && root.right == null) {
			int n = maxDepth(root.left) +1 ;
			System.out.println(root.data + " << right null = " + n);

			return n ;

		}

		else {
			int l = maxDepth(root.left);
			int r = maxDepth(root.right);
			System.out.println("l : " + l + " r : " + r);

			return Math.max(l, r) + 1;
		}

	}

	public static void main(String args[]) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(6);
		tree.root.left.left.left.left = new Node(7);

		System.out.println("Min: " + minDepth(tree.root));
		System.out.println("Max: " + maxDepth(tree.root));

	}

}
