package prac.binarySearchTree;

/**
 * Created on 4/23/2018.
 */
public interface Tree<T> {

    public void insert(T data);
    public void delete(T data);
    public T getMinValue();
    public T getMaxValue();
    public void traversal();

}
