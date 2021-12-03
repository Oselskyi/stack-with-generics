package stack;

public class StackArray<T> implements Stack<T> {

    private T[] stackArray;
    private int stackTop;

    public StackArray(T[] stackArray) {

        this.stackArray = stackArray;
        stackTop = -1;
    }
    @Override
    public void push(T element) {

        if (stackTop + 1 == stackArray.length) {
            System.out.println("You can't push new element! Stack is full");
        } else stackArray[++stackTop] = element;
    }

    public T pop() {
        if (stackTop == -1) {

            return null;
        }

        T poped = stackArray[stackTop];
        stackArray[stackTop] = null;
        stackTop--;

        return poped;
    }

    public T peek() {
        if (stackTop == -1) {

            return null;
        }

        return stackArray[stackTop];
    }

    public boolean isEmpty() {

        return stackTop == -1;
    }

    public boolean isFull() {

        return stackTop == stackArray.length - 1;
    }

}
