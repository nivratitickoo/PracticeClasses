package prac.binarySearchTree;

/**
 * Created on 4/23/2018.
 */
public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {

        if(root == null) {
            root = new Node<T>(data);
        }
        else{
            insertNode(data,root);
        }
    }

    private void insertNode(T newData, Node<T> node){

        if(newData.compareTo(node.getData())<0){
            if(node.getLeftChild() != null){
                insertNode(newData,node.getLeftChild());
            }
            else{
                Node<T> newNode = new Node<T>(newData);
                node.setLeftChild(newNode);
            }
        }
        else {

            if (node.getRightChild() != null) {
                insertNode(newData, node.getRightChild());
            } else {
                Node<T> newNode = new Node<T>(newData);
                node.setRightChild(newNode);
            }
        }

    }

    @Override
    public T getMinValue() {
        if(root == null) return null;

        return getMin(root);
    }

    private T getMin(Node<T> node) {

        if(node.getLeftChild()!=null){
            return getMin(node.getLeftChild());
        }
        return(node.getData());
    }

    @Override
    public T getMaxValue() {

        if(root == null) return null;

        return getMax(root);

    }

    private T getMax(Node<T> node) {

        if(node.getRightChild()!=null){
            return getMax(node.getRightChild());
        }
        return(node.getData());
    }

    @Override
    public void traversal() {

        if(root != null){
            inOrderTraversal(root);
        }

    }

    private void inOrderTraversal(Node<T> node) {

        if(node.getLeftChild()!=null){
            inOrderTraversal(node.getLeftChild());
        }
        System.out.print(node+" -> ");

        if(node.getRightChild()!=null){
            inOrderTraversal(node.getRightChild());
        }

    }


    @Override
    public void delete(T data) {

    }
}
