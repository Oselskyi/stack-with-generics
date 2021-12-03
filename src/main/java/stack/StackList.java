package stack;

import java.util.ArrayList;

public class StackList<T> implements Stack<T> {


    private int top;
    ArrayList<T> stackList;
    int capacity ;

    public StackList(ArrayList<T> stackList, int capacity) {

        top = -1;
        this.capacity = capacity;
        this.stackList = stackList;
    }

    @Override
    public void push(T element) {

        top = top + 1;

        if (top+1 == stackList.size()){
            System.out.println("You can't push new element! Stack is full");
        }
        else
            stackList.add(element);

    }


    public T pop() {

        if (top == -1) {

            return null;
        } else {
            T removedElem = stackList.get(top);
            top--;
            return removedElem;
        }
    }

    public boolean isEmpty() {

        return (top == -1);
    }


    public T peek() {

        if (top == -1) {

            return null;
        } else
            return stackList.get(top);
    }

    public boolean isFull() {

        return top == capacity - 1;
    }
}
