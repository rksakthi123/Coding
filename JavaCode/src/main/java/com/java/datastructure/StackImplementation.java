package com.java.datastructure;

public class StackImplementation {

	Node top;
	int max = 10;
	int size = 0;

	class Node {
		Node next;
		int data;
	}

	public static void main(String[] args) {

		StackImplementation obj = new StackImplementation();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.display();
		obj.pop();
		obj.pop();
		obj.display();
		obj.pop();
		obj.pop();
	}
	
	public void pop() {
		Node temp=top;
		if(top==null) {
			System.out.println("stack is empty");
		}
		else {
			top=top.next;
		}
	}

	public void push(int value) {
		Node node = new Node();
		node.data = value;
		if (top == null) {
			top = node;
			size++;
		} else {
			if (max == size) {
				System.out.println("stack is full");
			} else {
				node.next = top;
				top = node;
				size++;
			}
		}
	}

	public void display() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println("=============");
	}

}
