package math;
public class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}

	public void insert(int value) {
		if (value <= data) {
			if (left == null) {
				left = new Node(value);
			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new Node(value);
			} else {
				right.insert(value);
			}
		}
	}
	
	public void printInOrder() {
		if (left != null) {
			left.printInOrder();
		}
		System.out.println(data);
		if (right != null) {
			right.printInOrder();
		}
	}
}