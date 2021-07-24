package Lab1StackImplementation;

import java.util.EmptyStackException;

public class ArrayStack<T> {

	private T[] stackArray; 
	private int stackLength; 
	private int capacity;
	private static final int DEFAULT_CAPACITY = 25; //not really needed unless if your stack requires a specific capacity

	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}
	@SuppressWarnings("unchecked")
	public ArrayStack(int intitialCapacity) {// creates an empty stack with any capacity you want
		T[] tempStack = (T[]) (new Object[intitialCapacity]);
		stackArray = tempStack;
		stackLength= -1;
	}

	public void push(T anEntry) {// adds an item in the top of the stack
		if (isFull()) {
			ensureCapacity(); // Push can be implemented without this and you can call a fullstack exception
								// but a user would most likely want to increase the capacity of a stack if its full
		}
		stackArray[capacity] = anEntry;
		capacity++;
	}

	public T pop() {// removes the item on the top of the stack
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		T outData = stackArray[capacity-1]; // returns the data of the stack current stack and sets null to remove the last one
		stackArray[capacity-1] = null;
		capacity--;
		return outData;
	}

	public T peek() {// in case you wanted to look at the last item of the stack
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stackArray[capacity - 1];
	}

	public void Display(ArrayStack<T> stack) {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		System.out.println(stack.pop());
	}

	public boolean isEmpty() {//also want to check if a stack is empty just in case you are trying to remove something
		return capacity == 0;
	}

	private boolean isFull() {//always want to check if a stack is full before adding any other element
		return capacity == stackLength;
	}

	@SuppressWarnings("unchecked")
	private void ensureCapacity() {//just a precaution to extend the length of the stack just in case its needed
		T[] larger = (T[]) (new Object[stackArray.length * 2]);

		for (int index = 0; index < stackArray.length; index++)
			larger[index] = stackArray[index];

		stackArray = larger;
	}
	public static void main(String[] args) {
		ArrayStack<Integer> stack = new ArrayStack<Integer>(); //integer for test but can be anything because the class was generic
		
		for(int i = 0; i<= 4; i++) {// 4 is just for testing but can be any number dependent on how long you want the stack to be
			stack.push(i);
		}
		for(int j = 0; j<= 4; j++) {
			stack.Display(stack);
		}
	}
}