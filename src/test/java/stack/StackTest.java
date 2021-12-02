package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void pushIntegerTest() {

        Stack<Integer> stack = new Stack<>(5);
        int element = stack.push(5);
        assertEquals(5, element);
    }

    @Test
    void pushStringTest() {

        Stack<String> stack = new Stack<>(5);
        stack.push("5");
        stack.push("6");
        String element = stack.push("8");
        assertEquals("8", element);
    }


    @Test
    void popInegerTest() {

        Stack<Integer> stack = new Stack<>(5);
        stack.push(5);
        stack.push(7);
        int deletedElement = stack.pop();
        assertEquals(7, deletedElement);
    }

    @Test
    void popStringTest() {

        Stack<String> stack = new Stack<>(5);
        stack.push("5");
        stack.push("7");
        String deletedElement = stack.pop();
        assertEquals("7", deletedElement);
    }

    @Test
    void popErrorTest() {

        Stack<String> stack = new Stack<>(5);
        String deletedElement = stack.pop();
        assertNull(deletedElement);
    }

    @Test
    void isEmpty() {

        Stack<Integer> stack = new Stack<>(5);
        assertTrue(stack.isEmpty());
    }

    @Test
    void isNotEmpty() {

        Stack<Integer> stack = new Stack<>(5);
        stack.push(5);
        assertFalse(stack.isEmpty());
    }

    @Test
    void topIntegerTest() {

        Stack<Integer> stack = new Stack<>(5);
        stack.push(5);
        stack.push(7);
        int element = stack.top();
        assertEquals(7, element);
    }

    @Test
    void topStringTest() {

        Stack<String> stack = new Stack<>(5);
        stack.push("5");
        stack.push("7");
        String element = stack.top();
        assertEquals("7", element);
    }

    @Test
    void topErrorTest() {

        Stack<String> stack = new Stack<>(5);

        String element = stack.top();
        assertNull(element);
    }

}