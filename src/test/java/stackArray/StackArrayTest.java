package stackArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StackArrayTest<T> {

    @Test
    void push() {

        String[] array = new String[5];
        String[] arrayString = {"1", "2", "3", null, null};
        StackArray<String> stackArray = new StackArray<String>(array);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        assertEquals(Arrays.toString(arrayString), Arrays.toString(array));
    }

    @Test
    void pop() {

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
    void peek() {

        String[] array = new String[5];
        StackArray<String> stackArray = new StackArray<String>(array);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        assertEquals("3", stackArray.peek());
    }

    @Test
    void isEmpty() {

        String[] array = new String[5];
        StackArray<String> stackArray = new StackArray<String>(array);
        assertTrue(stackArray.isEmpty());
    }

    @Test
    void isNotEmpty() {

        String[] array = new String[5];
        StackArray<String> stackArray = new StackArray<String>(array);
        stackArray.push("1");
        stackArray.push("2");
        stackArray.push("3");
        assertFalse(stackArray.isEmpty());
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