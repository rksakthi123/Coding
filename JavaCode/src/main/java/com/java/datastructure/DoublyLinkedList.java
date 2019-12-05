package com.java.datastructure;

public class DoublyLinkedList {

	Node head;
	Node tail;

	class Node {
		Node left;
		Node right;
		int data;
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addFirst(10);
		dll.addFirst(20);
		dll.addLast(30);
		dll.addAfter(40, 10);
		dll.addBefore(50, 40);
		dll.remove(20);
		dll.display();

	}

	public void remove(int value) {
		Node temp = head;
		Node prev = head;
		while (temp != null) {
			if (temp.data == value) {
				if (temp == tail) {
					tail = prev;
					tail.right = null;
				} else if (temp == head) {
					head = head.right;
				} else {
					Node next = temp.right;
					prev.right=next;
					next.left=prev;
					
				}
			}
			prev = temp;
			temp = temp.right;
		}
	}

	public void addBefore(int value, int index) {
		Node node = new Node();
		node.data = value;
		Node temp = head;
		Node prev = head;

		while (temp != null) {
			if (temp.data == index) {
				if (temp == tail) {
					addLast(value);
				} else if (temp == head) {
					addFirst(value);
				} else {
					prev.right = node;
					node.left = prev;
					node.right = temp;
					temp.left = node;
				}
				break;
			}
			prev = temp;
			temp = temp.right;
		}
	}

	public void addAfter(int value, int index) {
		Node node = new Node();
		node.data = value;
		Node temp = head;
		while (temp != null) {
			if (temp.data == index) {
				if (temp == tail) {
					addLast(value);
				} else {
					Node next = temp.right;
					temp.right = node;
					node.left = temp;
					node.right = next;
					next.left = node;
				}
				break;
			}
			temp = temp.right;
		}
	}

	public void addLast(int value) {
		Node node = new Node();
		node.data = value;
		Node temp = tail;
		tail = node;
		temp.right = tail;
		tail.left = temp;
		tail.right = null;
	}

	public void addFirst(int value) {
		Node node = new Node();
		node.data = value;
		if (head == null) {
			head = node;
			tail = node;
			tail.right = null;
		} else {
			Node temp = head;
			head = node;
			head.right = temp;
			temp.left = head;
		}
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.right;
		}
	}

}
