public class LinkedList<T> implements List<T> {
    private Node<T> head;
    public int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToFront(T data) {
        Node<T> newNode = new Node<T> (data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    @Override
    public T removeFirst() {
        Node<T> firstNode = head;
        head = firstNode.getNext();
        return firstNode.getData();
    }
}

