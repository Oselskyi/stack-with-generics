package stack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void pushList() {

        ArrayList<Integer> numbers = new ArrayList<>(7);
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3));

        StackList<Integer> stackList = new StackList<Integer>(numbers);
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        assertEquals(numbers1, numbers);

    }

    @Test
    void pushArray() {

        String[] array = new String[5];
        String[] arrayString = {"1", "2", "3", null, null};
        StackArray<String> stackArray = new StackArray<String>(array);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        assertEquals(Arrays.toString(arrayString), Arrays.toString(array));
    }

    @Test
    void popListTest() {

        StackList<Integer> stackList = new StackList<>(new ArrayList<>(5));
        stackList.push(5);
        stackList.push(7);
        int deletedElement = stackList.pop();
        assertEquals(7, deletedElement);
    }
    @Test
    void popArray() {

        String[] array = new String[5];
        String[] arrayString = {"1", "2", null, null, null};
        StackArray<String> stackArray = new StackArray<String>(array);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        stackArray.pop();
        assertEquals(Arrays.toString(arrayString), Arrays.toString(array));
    }

    @Test
    void popErrorTest() {

        StackList<String> stackList = new StackList<>(new ArrayList<>(5));
        String deletedElement = stackList.pop();
        assertNull(deletedElement);
    }

    @Test
    void isEmptyList() {

        StackList<Integer> stackList = new StackList<>(new ArrayList<>(5));
        assertTrue(stackList.isEmpty());
    }

    @Test
    void isNotEmptyList() {

        StackList<Integer> stackList = new StackList<>(new ArrayList<>(5));
        stackList.push(5);
        assertFalse(stackList.isEmpty());
    }

    @Test
    void isEmptyArray() {

        String[] array = new String[5];
        StackArray<String> stackArray = new StackArray<String>(array);
        assertTrue(stackArray.isEmpty());
    }

    @Test
    void isNotEmptyArray() {

        String[] array = new String[5];
        StackArray<String> stackArray = new StackArray<String>(array);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        assertFalse(stackArray.isEmpty());
    }

    @Test
    void peekIntegerTest() {

        StackList<Integer> stackList = new StackList<>(new ArrayList<>(5));
        stackList.push(5);
        stackList.push(7);
        int element = stackList.peek();
        assertEquals(7, element);
    }

    @Test
    void peek() {

        String[] array = new String[5];
        StackArray<String> stackArray = new StackArray<String>(array);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        assertEquals("3", stackArray.peek());
    }

    @Test
    void peekErrorTest() {

        StackList<String> stackList = new StackList<>(new ArrayList<>(5));

        String element = stackList.peek();
        assertNull(element);
    }

    @Test
    void isFull() {

        String[] array = new String[5];
        StackArray<String> stackArray = new StackArray<String>(array);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        stackArray.push("4");
        stackArray.push("5");
        assertTrue(stackArray.isFull());
    }

    @Test
    void isNotFull() {

        String[] array = new String[5];
        StackArray<String> stackArray = new StackArray<String>(array);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        assertFalse(stackArray.isFull());
    }

}