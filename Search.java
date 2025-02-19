import java.util.Scanner;

class Node{
	int data;
	Node next;
	public Node(int item) {
		this.data = item;
		this.next = null;
	}
}
public class Search {
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
	public boolean find(int key) {
		while(head!=null) {
			if(head.data==key) {
				return true;
			}
			head = head.next;
		}
		return false;
	}
	public int length() {
		int len = 0;
		Node temp = head;
		while(temp!=null) {
			len++;
			temp = temp.next;
		}
		return len;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Search LL = new Search();
		System.out.println("Enter the no.of data's you want to enter :");
		int n = sc.nextInt();
		System.out.println("Enter the data's :");
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			LL.insert(m);
		}
		int len = LL.length();
		System.out.println("Length of the Linked List = "+len);
		System.out.println("Enter the data to find :");
		int a = sc.nextInt();
		if(LL.find(a)) {
			System.out.println("Data is exists");
		}else {
			System.out.println("Data is not exists");
		}
		sc.close();
	}
}
