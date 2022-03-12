public class LinkedStack<T> implements Stack<T>{

    public LinkedList<T> list = new LinkedList<>();

    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public void push(T eim) {
        list.addToFront(eim);
    }

    @Override
    public T pop() {
        return list.removeFirst();
    }
}
