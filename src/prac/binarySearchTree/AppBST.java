package prac.binarySearchTree;

/**
 * Created on 4/23/2018.
 */
public class AppBST {

    public static void main(String[] args){

        Tree<Integer> bst = new BinarySearchTree<Integer>();

        bst.insert(10);
        bst.insert(3);
        bst.insert(5);
        bst.insert(15);

        System.out.println(bst.getMinValue());
        System.out.println(bst.getMaxValue());

    }
}
