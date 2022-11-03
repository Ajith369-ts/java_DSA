public class Stack
{
	int top = -1;
	int n = 10;
	int[] stack = new int[n];

	public void push(int data)
	{
		if(top == n - 1)
			System.out.println("Overflow of stack");
		else
		{
			top++;
			stack[top] = data;
		}
	}

	public void pop()
	{
		if(top == -1)
			System.out.println("Underflow of array");
		else
		{
			System.out.println(stack[top] + " poped.");
			top--;
		}
	}

	public void peek()
	{
		if(top == -1)
			System.out.println("Underflow of array");
		else
			System.out.println(stack[top]);
	}

	public void display()
	{
		for(int i = top; i >= 0; i--)
		{
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		Stack test = new Stack();

		test.push(2);
		test.push(6);
		test.push(3);
		test.push(8);
		test.push(5);
		test.push(3);

		test.display();
		test.peek();

		test.pop();
		test.pop();
		test.pop();

		test.display();
		test.peek();
	}
}