package prac.binarySearchTree;

/**
 * Created on 4/23/2018.
 */
public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public Node(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftChild(){
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild(){
        return this.rightChild;
    }

    public void setRightChild(Node<T> rightChild){
        this.rightChild = rightChild;
    }

    @Override
    public String toString(){
        return this.data.toString();
    }

    }
