public class LL
{
	Node head;
	private int length = 0;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
			length++;
		}
	}

// ---------------------------------------------------------- LENGTH
	public int getLength()
	{
		return length;
	}
	
// ---------------------------------------------------------- ADD
	// INSERT AT FIRST
	public void insertFirst(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}
	
	// INSERT AT LAST
	public void insertLast(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}

	// INSERT AT A POSITION
	public void insertAtPosition(int data, int position)
	{
		Node newNode = new Node(data);
		Node currNode = head;

		if(head == null)
		{
			head = newNode;
			return;
		}

		int i = 1;
		while(i < position)
		{
			currNode = currNode.next;
			i += 1;
		}

		newNode.next = currNode.next;
		currNode.next = newNode;
	}

// ----------------------------------------------------------  REMOVE
	//REMOVE FIRST ELEMENT
	public void removeFirst()
	{
		if(head == null)
		{
			System.out.println("Nothing to remove");
			return;
		}
		length -= 1;
		head = head.next;
	}
	
	//REMOVE LAST ELEMENT
	public void removeLast()
	{
		if(head == null)
		{
			System.out.println("Nothing to remove");
			return;
		}
		
		Node currNode = head;
		while(currNode.next.next != null)
		{
			currNode = currNode.next;
		}

		length -= 1;
		currNode.next = null;
		// Node secondLast = head;
		// Node lastNode = head.next;
		// while(lastNode.next != null)
		// {
		// 	lastNode = lastNode.next;
		// 	secondLast = secondLast.next;
		// }

		// secondLast.next = null;
	}

// ----------------------------------------------------------  REVERSE A LINKED-LIST
	public void reverse()
	{
		if(head == null || head.next == null)
		{
			return;
		}

		Node prevNode = null;
		Node currNode = head, nextNode = head;

		while(nextNode != null)
		{
			nextNode = nextNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
	}
	

// ----------------------------------------------------------  PRINT LIST	
	public void printLinkedList()
	{
		if(head == null)
		{
			System.out.println("list is empty");
			return;
		}
		Node currNode = head;
		
		while(currNode.next != null)
		{
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.print(currNode.data);
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		LL list = new LL();
		
		list.insertFirst(4);
		list.insertFirst(2);
		list.insertFirst(5);

		list.printLinkedList();
		System.out.println("length of the list " + list.getLength());
		
		list.insertLast(24);
		list.insertLast(12);
		list.insertLast(8);

		list.printLinkedList();
		System.out.println("length of the list " + list.getLength());

		list.insertAtPosition(34, 2);
		list.printLinkedList();
		System.out.println("length of the list " + list.getLength());
		
		list.removeFirst();
		list.removeFirst();
		list.removeLast();
		
		list.printLinkedList();
		System.out.println("length of the list " + list.getLength());

		list.reverse();
		System.out.print("reversed linked list ");
		list.printLinkedList();
		System.out.println("length of the list " + list.getLength());
	}
}