package Single_LinkedList;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	public Node(int item) {
		this.data = item;
		this.next = null;
	}
}
public class Traversal {
	private Node head;
	
	public void insert( int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode; 
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newnode;
		
	}
	public void traversedata() {
		System.out.println("Linked List :");
		while(head!=null) {
			System.out.print(head.data+" -> ");
			head = head.next;
		}
		System.out.print("NULL");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Traversal LL = new Traversal();
		System.out.println("Enter the no.of data's you want to enter :");
		int n = sc.nextInt();
		System.out.println("Enter the data's :");
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			LL.insert(m);
		}
		LL.traversedata();
		sc.close();
	}
}
