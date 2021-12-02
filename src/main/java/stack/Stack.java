package stack;

import java.util.ArrayList;

public class Stack<T> {
    private int size;

    private int top = -1;
    ArrayList<T> stackArray;

    public Stack(int size) {

        this.size = size;
        stackArray = new ArrayList<T>(size);
    }

    public T push(T element) {

        top = top + 1;

        if (top < stackArray.size())
            stackArray.set(top, element);
        else
            stackArray.add(element);
        return element;
    }


    public T pop() {

        if (top == -1) {

            return null;
        } else {
            T removedElem = stackArray.get(top);
            top--;
            return removedElem;
        }
    }

    public boolean isEmpty() {

        return (top == -1);
    }


    public T top() {

        if (top == -1) {


            return null;
        } else
            return stackArray.get(top);
    }
}
