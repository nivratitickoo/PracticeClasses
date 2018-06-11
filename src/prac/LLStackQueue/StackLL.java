package prac.LLStackQueue;

/**
 * Created by QXO4360 on 4/20/2018.
 */
public class StackLL<T extends Comparable<T>> {

    private Node<T> top;
    private int count;

    //O(1)
    public void push(T newData){

        this.count++;
        if(this.top == null){
            this.top = new Node<>(newData);
        }
        else {
            Node<T> oldTop = this.top;
            this.top = new Node<>(newData);
            this.top.setNextNode(oldTop);
        }

    }

    //O(1)
    public T pop(){

        if(this.top == null) return null; //check this
        T popdata = this.top.getData();
        this.top = this.top.getNextNode();
        this.count--;
        return popdata;

    }

    //O(1)
    public T peek(){
       return this.top.getData();

    }

    public int size(){
        return this.count;
    }

    public boolean isEmpty(){
        return this.top == null;

    }
}
