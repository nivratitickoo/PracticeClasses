package prac.LLStackQueue;

/**
 * Created by QXO4360 on 4/19/2018.
 */
public class App {

    public static void main(String[] args){

        List<String> ls = new LinkedList<String>();

        ls.insert("Adam");
        ls.insert("Kevin");
        ls.insert("Eric");

        ls.remove("Adam");

        ls.traverseList();
    }
}
