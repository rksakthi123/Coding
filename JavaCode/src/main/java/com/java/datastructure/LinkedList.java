package com.java.datastructure;

public class LinkedList {

	Node head;
	Node tail;

	class Node {
		int data;
		Node next;
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addAfter(50, 40);
		ll.addBefore(60, 40);
		ll.addLast(20);
		ll.remove(50);
		ll.display();
	}

	public void remove(int value) {
		Node temp = head;
		Node prev = head;
		while (temp != null) {
			if(temp.data==value) {
				if(temp==head) {
					head=temp.next;
				}
				else if(temp==tail) {
					tail=prev;
					tail.next=null;
				}
				else {
					prev.next=temp.next;
				}
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		
	}

	public void addFirst(int value) {
		Node node = new Node();
		node.data = value;
		if (head == null) {
			head = node;
			tail = node;
			tail.next = null;
		} else {
			node.next = head;
			head = node;
		}
	}

	public void addBefore(int value, int index) {
		Node temp = head;
		Node prev = head;
		Node node = new Node();
		node.data = value;
		while (temp != null) {
			if (temp.data == index) {
				if (temp == head) {
					addFirst(value);
				} else {
					prev.next = node;
					node.next = temp;
				}
				break;
			}

			prev = temp;
			temp = temp.next;
		}
	}

	public void addAfter(int value, int index) {
		Node temp = head;
		Node node = new Node();
		node.data = value;
		while (temp != null) {
			if (temp.data == index) {
				if (temp == tail) {
					addLast(value);
				} else {
					Node next = temp.next;
					temp.next = node;
					node.next = next;
				}
				break;
			}

			temp = temp.next;
		}
	}

	public void addLast(int value) {
		Node node = new Node();
		node.data = value;
		tail.next = node;
		tail = node;
		tail.next = null;
	}

	public void display() {
		Node temp = head;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

}
