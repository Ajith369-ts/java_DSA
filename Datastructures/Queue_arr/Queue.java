public class Queue
{

	int n = 10;
	int[] queue = new int[n];
	int front = -1, rear = -1;

	public void enqueue(int data)
	{
		if(rear == n - 1)
		{
			System.out.println("Queue full. Overflow condition.");
		}
		else if(front == -1 && rear == -1)
		{
			front = rear = 0;
			queue[rear] = data;
		}
		else
		{
			rear += 1;
			queue[rear] = data;
		}
	}

	public void dequeue()
	{
		if(front == -1 && rear == -1)
		{
			System.out.println("Queue empty. Undeflow condition.");
		}
		else if(front == rear)
		{
			System.out.println(queue[front] + " popped out");
			front = rear = -1;
		}
		else
		{
			System.out.println(queue[front] + " popped out");
			front += 1;
		}
	}

	public void peek()
	{
		if(front == -1 && rear == -1)
		{
			System.out.println("Queue is empty");
			return;
		}

		System.out.println(queue[front]);
	}

	public void display()
	{
		if(front == -1 && rear == -1)
		{
			System.out.println("Queue is empty");
			return;
		}

		for(int i = front; i < rear + 1; i++)
		{
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Queue q = new Queue();

		q.enqueue(3);
		q.enqueue(6);
		q.enqueue(2);
		q.enqueue(7);
		q.enqueue(8);

		q.display();
		q.peek();

		q.dequeue();
		q.dequeue();
		q.dequeue();

		q.display();
		q.peek();
	}
}