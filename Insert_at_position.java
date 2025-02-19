package Single_LinkedList;

import java.util.Scanner;

public class Insert_at_position {
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
	private Node insertatposition(int data,int pos) {

		if(pos<1) {
			System.out.println("Invalid position");
			return head;
		}

		Node temp = new Node(data);
		if(pos==1) {
			temp.next = head;
			return temp;
		}
		Node prev = head;
		int count = 1;
		while(count<pos-1&&prev!=null) {
			prev = prev.next;
			count++;
		}
		if(prev==null) {
			System.out.println("Invalid position");
			return head;
		}
		temp.next = prev.next;
		prev.next= temp;
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
		Insert_at_position LL = new Insert_at_position();
		System.out.println("Enter the no.of data's you want to enter :");
		int n = sc.nextInt();
		System.out.println("Enter the data's :");
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			LL.insert(m);
		}
		System.out.println("Enter the value :");
		int data = sc.nextInt();
		System.out.println("Enter the Position :");
		int pos = sc.nextInt();
		System.out.print("Original ");
		LL.traversedata();
		LL.insertatposition(data,pos);
		System.out.print("\nNew ");
		LL.traversedata();
		sc.close();
	}
}
