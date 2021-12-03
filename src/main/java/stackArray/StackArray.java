package stackArray;

public class StackArray<T> {

    private T[] stackArray;
    private int stackTop;

    public StackArray(T[] stackArray) {

        this.stackArray = stackArray;
        stackTop = -1;
    }

    public void push(T element) {

        if (stackTop + 1 == stackArray.length) {
            System.out.println("You can't push new element! Stack is full");
        } else stackArray[++stackTop] = element;
    }

    public T pop() {

        T poped = stackArray[stackTop];
        stackArray[stackTop] = null;
        stackTop--;

        return poped;
    }

    public T peek() {

        return stackArray[stackTop];
    }

    public boolean isEmpty() {

        return stackTop == -1;
    }

    public boolean isFull() {

        return stackTop == stackArray.length - 1;
    }

}
