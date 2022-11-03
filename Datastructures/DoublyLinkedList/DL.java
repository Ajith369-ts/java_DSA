public class DL
{
	Node head;
	Node tail;

	class Node
	{
		int data;
		Node next;
		Node prev;

		Node(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

// ---------------------------------------------------------- ADD
	// INSERT AT FIRST
	public void insertFirst(int data)
	{
		Node newNode = new Node(data);

		if(head == null)
		{
			head = newNode;
			tail = newNode;
			return;
		}

		newNode.next = head;
		head.prev = newNode;
		head = newNode; 
	}

	// INSERT AT END
	public void insertLast(int data)
	{
		Node newNode = new Node(data);

		if(head == null)
		{
			head = newNode;
			return;
		}

		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	// INSERT AT A POSITION
	// public void insertAtPosition(int data, int position)
	// {
	// 	Node newNode = new Node(data);
	// 	Node currNode = head;

	// 	if(head == null)
	// 	{
	// 		head = newNode;
	// 		return;
	// 	}

	// 	int i = 1;
	// 	while(i < position)
	// 	{
	// 		currNode = currNode.next;
	// 		i += 1;
	// 	}

	// 	newNode.next = currNode.next;
	// 	currNode.next = newNode;
	// }

// ----------------------------------------------------------  REMOVE
	//REMOVE FIRST ELEMENT
	// public void removeFirst()
	// {
	// 	if(head == null)
	// 	{
	// 		System.out.println("Nothing to remove");
	// 		return;
	// 	}
	// 	head = head.next;
	// }

// ----------------------------------------------------------  PRINT LIST	
	public void printDlinkedList()
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

// ----------------------------------------------------------  PRINT LIST IN REVERSE
	public void reversePrintDlist()
	{
		if(tail == null)
		{
			System.out.println("list is empty");
			return;
		}

		Node currNode = tail;

		while(currNode.prev != null)
		{
			System.out.print(currNode.data + " -> ");
			currNode = currNode.prev;
		}
		System.out.print(currNode.data);
		System.out.println();
	}

	public static void main(String[] args)
	{
		DL d_list = new DL();

		d_list.insertFirst(3);
		d_list.insertFirst(5);
		d_list.insertFirst(7);
		d_list.insertFirst(2);

		d_list.printDlinkedList();
		d_list.reversePrintDlist();

		d_list.insertLast(1);
		d_list.insertLast(8);
		d_list.insertLast(3);
		d_list.insertLast(6);

		d_list.printDlinkedList();
		d_list.reversePrintDlist();
	}
}