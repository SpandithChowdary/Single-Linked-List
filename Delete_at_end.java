package Single_LinkedList;

import java.util.Scanner;

public class Delete_at_end {
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

	private Node deleteatend() {
		if(head==null) return null;
		if(head.next==null) {
			head = null;
			return null;
		}
		Node second_prev = head;
		while(second_prev.next.next != null) {
			second_prev = second_prev.next;
		}
		second_prev.next = null; 
		return head;
	}
	
	public void traversedata() {
		System.out.println("Linked List :");
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.print("NULL");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Delete_at_end LL = new Delete_at_end();
		System.out.println("Enter the no.of data's you want to enter :");
		int n = sc.nextInt();
		System.out.println("Enter the data's :");
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			LL.insert(m);
		}
		System.out.print("Original ");
		LL.traversedata();
		LL.deleteatend();
		System.out.print("\nAfter Delete ");
		LL.traversedata();
		sc.close();
	}
}
