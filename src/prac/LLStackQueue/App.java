package prac.LLStackQueue;

/**
 * Created  on 4/19/2018.
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
