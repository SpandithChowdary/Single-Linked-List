import java.util.Scanner;

class Node{
	int data;
	Node next;
	public Node(int item) {
		this.data = item;
		this.next = null;
	}
}

public class Insert_at_end {
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
	private Node insertatend(int data) {
		Node newnode = new Node(data);
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newnode;
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
		Insert_at_end LL = new Insert_at_end();
		System.out.println("Enter the no.of data's you want to enter :");
		int n = sc.nextInt();
		System.out.println("Enter the data's :");
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			LL.insert(m);
		}
		System.out.println("Enter the value :");
		int data = sc.nextInt();
		System.out.print("Original ");
		LL.traversedata();
		LL.insertatend(data);
		System.out.print("\nNew ");
		LL.traversedata();
		sc.close();
	}
}
