package stack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void push() {

        ArrayList<Integer> numbers = new ArrayList<>(7);
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3));

        Stack<Integer>  stackList = new StackList<Integer>(numbers,5);
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        assertEquals(numbers1, numbers);

        String[] strings = new String[5];
        String[] strings1 = {"1", "2", "3", null, null};

        Stack<String>  stackArray = new StackArray<>(strings);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        assertEquals(Arrays.toString(strings1), Arrays.toString(strings));

    }

    @Test
    void pop() {

        Stack<String> stackList = new StackList<>(new ArrayList<>(),5);
        stackList.push("5");
        stackList.push("7");
        String deletedElement = stackList.pop();
        assertEquals("7", deletedElement);

        Stack<String> stackArray = new StackArray<>(new String[5]);
        stackArray.push("5");
        stackArray.push("7");
        String popedElement = stackArray.pop();
        assertEquals("7", popedElement);
    }


    @Test
    void popErrorTest() {

        Stack<String> stackList = new StackList<>(new ArrayList<>(),5);
        String deletedElement = stackList.pop();
        assertNull(deletedElement);

        Stack<String> stackArray = new StackArray<>(new String[5]);
        String popedElement = stackArray.pop();
        assertNull(popedElement);
    }

    @Test
    void isEmpty() {

        Stack<Integer> stackList = new StackList<>(new ArrayList<>(),5);
        assertTrue(stackList.isEmpty());

        Stack<String> stackArray = new StackArray<>(new String[5]);
        assertTrue(stackArray.isEmpty());
    }

    @Test
    void isNotEmpty() {

        Stack<String> stackArray = new StackArray<>(new String[5]);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        assertFalse(stackArray.isEmpty());

        Stack<Integer> stackList = new StackList<>(new ArrayList<>(),5);
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        assertFalse(stackList.isEmpty());
    }

    @Test
    void peek() {

        Stack<String> stackArray = new StackArray<>(new String[5]);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        assertEquals("3", stackArray.peek());

        Stack<Integer> stackList = new StackList<>(new ArrayList<>(),5);
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        assertEquals(3, stackList.peek());
    }

    @Test
    void peekErrorTest() {

        StackList<String> stackList = new StackList<>(new ArrayList<>(),5);
        String element = stackList.peek();
        assertNull(element);

        Stack<String> stackArray = new StackArray<>(new String[5]);
        String element1 = stackArray.peek();
        assertNull(element1);
    }

    @Test
    void isFull() {

        Stack<String> stackArray = new StackArray<>(new String[5]);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        stackArray.push("4");
        stackArray.push("5");
        assertTrue(stackArray.isFull());

        StackList<String> stackList = new StackList<>(new ArrayList<>(),5);
        stackList.push("1");
        stackList.push("2");
        stackList.push("3");
        stackList.push("4");
        stackList.push("5");
        assertTrue(stackList.isFull());
    }

    @Test
    void isNotFull() {

        Stack<Integer> stackList = new StackList<>(new ArrayList<>(), 5);
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        assertFalse(stackList.isFull());

        Stack<String> stackArray = new StackArray<>(new String[5]);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        assertFalse(stackArray.isFull());
    }

}