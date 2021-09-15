package binarySearchTree.basics;
//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
public class BSTBasics {
    public static void main(String [] args){
        BSTree root = BSTree.insert(null, 6);
        root = BSTree.insert(root, 5);
        root = BSTree.insert(root, 3);
        root = BSTree.insert(root, 4);
        root = BSTree.insert(root, 2);
        root = BSTree.insert(root, 10);
        root = BSTree.insert(root, 9);
        BSTree.inOrderTraversal(root);
        System.out.print("\n");
        BSTree.delete(root, 4);
        BSTree.inOrderTraversal(root);
        System.out.print("\n");
        BSTree.levelOrderTraversal(root);
    }
}
