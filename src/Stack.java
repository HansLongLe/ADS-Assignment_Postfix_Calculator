import java.util.EmptyStackException;

public interface Stack<T> {

    boolean isEmpty();
    void push(T eim);
    T pop() throws EmptyStackException;
}
