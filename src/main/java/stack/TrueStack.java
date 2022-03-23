package stack;

public interface TrueStack<T> {
    void push(T element);

    T pop();

    int size();

    boolean isEmpty();
}
