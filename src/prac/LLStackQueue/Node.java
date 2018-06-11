package prac.LLStackQueue;

/**
 * Created  on 4/19/2018.
 */
public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> nextNode;

    Node(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString(){
        return this.data.toString();
    }


}
