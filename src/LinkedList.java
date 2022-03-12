public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private List list;
    public int size;

    @Override
    public void addToFront(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addToFront(T data) {

    }
}
