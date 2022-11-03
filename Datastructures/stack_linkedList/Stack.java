public class Stack
{
	Node head = null;

	class Node
	{
		int data;
		Node next;

		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	public void push(int data)
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

	public void pop()
	{
		if(head == null)
		{
			System.out.println("stack is empty");
			return;
		}

		System.out.println(head.data + " popped out of stack");
		head = head.next;
	}

	public void peek()
	{
		if(head == null)
		{
			System.out.println("stack is empty");
			return;
		}

		System.out.println(head.data);
	}

	public void display()
	{
		if(head == null)
		{
			System.out.println("stack is empty");
			return;
		}

		Node currNode = head;

		while(currNode != null)
		{
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Stack s = new Stack();

		s.push(4);
		s.push(5);
		s.push(2);
		s.push(7);
		s.push(8);

		s.display();
		s.peek();

		s.pop();
		s.pop();

		s.display();
		s.peek();
	}
}
