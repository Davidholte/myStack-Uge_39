/**
 * Created by 3299779 on 27/09/2016.
 */
public abstract class myStack<E> implements myStackInterface<E> {

    private int size = 0;
    private Object[] elements;
    private int top;

    
    public myStack(int s) {
        size = s;
        elements = new Object[size];
        top = -1;
    }

    public Object myPop() {
        if ( top == size -1) {
            throw new myEmptyStackException("Stack is empty yoyoyoyo");
        }
      return elements[top--];
    }

    public Object myPeek() {
        return elements[top];
    }

    public void myPush(E e) {
        if (top == size -1) {
            throw new myFullStackException("Stack is full yoyoyoyo");
        }
        elements[++top] = e;
    }

    public int mySize() {
        return size;
    }

    public boolean myIsEmpty() {
        return (top == -1);
    }

    public boolean myIsFull() {
        return (top == size -1);
    }
}

class myEmptyStackException extends RuntimeException {
    public myEmptyStackException() {
        this("Stack is empty yooooo");
    }
    public myEmptyStackException(String exception) {
        super(exception);
    }
}

class myFullStackException extends RuntimeException {
    public myFullStackException() {
        this("Stack is full yoooooooo");
    }

    public myFullStackException(String exception) {
        super(exception);
    }
}