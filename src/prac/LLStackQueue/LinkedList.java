package prac.LLStackQueue;

/**
 * Created by QXO4360 on 4/19/2018.
 */
public class LinkedList<T extends Comparable<T>> implements List<T>{

    private Node<T> root;
    private int sizeOfList ;

    @Override
    public void insert(T data) {

        ++this.sizeOfList;

        if(root == null){
            this.root = new Node<>(data);
        }
        else{
            insertDataAtBeginning(data);
        }
    }

    //O(1)
    private void insertDataAtBeginning(T data) {

        Node<T> newNode = new Node(data);
        newNode.setNextNode(root);
        this.root = newNode;

    }

    //O(N)
    private void insertDataAtEnd(T data, Node<T> node){

        Node<T> newNode = new Node(data);

        if(node.getNextNode()!=null){
            insertDataAtEnd(data,node); //recursion
        }
        else{
            node.setNextNode(newNode);
        }

    }

    @Override
    public void remove(T data) {

        --this.sizeOfList;

        //use of this??
        if(this.root.getData().compareTo(data)==0){
            this.root = this.root.getNextNode();
        }
        else{
            remove(data,root,root.getNextNode());
        }

    }

    private void remove(T dataToRemove, Node<T> previousNode, Node<T> actualNode) {

        while(actualNode!=null){

            if(actualNode.getData().compareTo(dataToRemove)== 0){

                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }

    }


    @Override
    public void traverseList() {

        if(this.root == null) return;

//        while(this.root.getNextNode()!=null){
//            System.out.print(this.root+" -> ");
//            this.root = this.root.getNextNode();
//        }
        Node<T> node = this.root;
        while(node!=null){
            System.out.print(node+" -> ");
            node = node.getNextNode();
       }


    }

    @Override
    public int size() {
        return sizeOfList;
    }

}
