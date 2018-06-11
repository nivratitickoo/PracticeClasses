package prac.LLStackQueue;

/**
 * Created by QXO4360 on 4/19/2018.
 */
public interface List<T extends Comparable<T>> {

    public void insert(T data);
    public void remove(T data);
    public void traverseList();
    public int size();

}
