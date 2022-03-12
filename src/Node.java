import javax.xml.crypto.Data;

public class Node<T> {
    private T data;
    private Node Node;

    public Node(){

    }

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData(){
        return data;
    }
    public void setNext(Node Node){
        this.Node = Node;
    }

    public Node getNext(){
        return Node;
    }
}
