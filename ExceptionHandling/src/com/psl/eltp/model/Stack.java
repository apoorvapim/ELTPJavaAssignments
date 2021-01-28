package com.psl.eltp.model;

public class Stack
{
    private Contact arr[];
    private int top;
    private int capacity;
 
    // Constructor to initialize stack
    Stack(int size)
    {
        arr = new Contact[size];
        capacity = size;
        top = -1;
    }
 
    // Utility function to add an element x in the stack
    public void push(Contact obj) throws StackOverflowException
    {
        if (isFull())
        {
            throw new StackOverflowException("Stack is already full!");
            
        }
        try {
			obj.validate();
		} catch (RequiredFieldException | InvalidFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Contact validation failed");
			System.exit(1);
		}
        System.out.println("Inserting contact..." );
        arr[++top] = obj;
    }
 
    // Utility function to pop top element from the stack
    public Contact pop() throws EmptyStackException
    {
        // check for stack underflow
        if (isEmpty())
        {
            throw new EmptyStackException("Stack is empty!");
            
        }
 
        System.out.println("Removing element ");
 
        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }
 
    // Utility function to return top element in a stack
    public Contact peek()
    {
        if (!isEmpty())
            return arr[top];
        else
            System.exit(1);
 
        return null;
    }
    public int size()
    {
        return top + 1;
    }
 
    // Utility function to check if the stack is empty or not
    public Boolean isEmpty()
    {
        return top == -1;    // or return size() == 0;
    }
 
    // Utility function to check if the stack is full or not
    public Boolean isFull()
    {
        return top == capacity - 1;    // or return size() == capacity;
    }
}
