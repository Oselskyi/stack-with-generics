package stack;

import java.util.ArrayList;

public class StackList<T> implements Stack<T> {


    private int top;
    ArrayList<T> stackList;

    public StackList(ArrayList<T> stackList) {

        top = -1;
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

        return top == stackList.size() - 1;
    }
}
