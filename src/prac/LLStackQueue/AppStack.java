package prac.LLStackQueue;

/**
 * Created  on 4/20/2018.
 */
public class AppStack {

    public static void main(String[] args){

        StackLL<Integer> stck = new StackLL<Integer>();
        stck.push(10);
        stck.push(100);
        stck.push(1000);

        System.out.println(stck.size());
        System.out.println(stck.peek());

        System.out.println(stck.pop());
        System.out.println(stck.pop());
        System.out.println(stck.pop());

        System.out.println(stck.size());
    }



}
