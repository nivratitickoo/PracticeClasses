package prac.LLStackQueue;

/**
 * Created  on 4/23/2018.
 */
public class AppQueue {

    public static void main(String[] args){

        QueueLL<Integer> myqueue = new QueueLL<Integer>();

        myqueue.enqueue(10);
        myqueue.enqueue(100);
        myqueue.enqueue(1000);

        System.out.println(myqueue.size());

        System.out.println(myqueue.dequeue());
        System.out.println(myqueue.dequeue());
        System.out.println(myqueue.dequeue());

        System.out.println(myqueue.size());


    }
}
