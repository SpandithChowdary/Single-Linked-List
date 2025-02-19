import java.util.Scanner;

class Node{
	int data;
	Node next;
	public Node(int item) {
		this.data = item;
		this.next = null;
	}
}

public class Delete_at_position {
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
	private void delete(int pos) {
		if(head == null || pos<1) {
			return;
		}
        
		if(pos==1) {
			Node temp = head;
			head = head.next ;
			temp = null;
			return ;
		}
		Node current = head;
		int count = 1;
		while(count < pos-1 && current != null) {
			current = current.next;
			count++;
		}
		if(current == null|| current.next == null) {
			return;
		}
		
		Node temp = current.next;
		current.next= current.next.next;
		temp = null;
		return ;
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
		Delete_at_position LL = new Delete_at_position();
		System.out.println("Enter the no.of data's you want to enter :");
		int n = sc.nextInt();
		System.out.println("Enter the data's :");
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			LL.insert(m);
		}
		System.out.println("Enter the position to delete:");
		int pos = sc.nextInt();
		System.out.print("Original ");
		LL.traversedata();
		LL.delete(pos);
		System.out.print("\nAfter Delete ");
		LL.traversedata();
		sc.close();
	}
}
