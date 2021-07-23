package construct;
/*
In a Preorder sequence, the leftmost element is the root of the tree.
So we know ‘A’ is the root for given sequences. By searching ‘A’ in the Inorder sequence,
we can find out all elements on the left side of ‘A’ is in the left subtree, and elements on right in the right subtree.*/


import introduction.Btree;

import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TreeFromInOrderandPreOrder {

    static Map<Integer, Integer> indexMapping = new HashMap<>();
    static int preIndex  = 0;

    public static void main(String [] args){
        List<Integer> preorder = new ArrayList<Integer>(Arrays.asList(1,2,4,5,3,6,7));
        List<Integer> inorder = new ArrayList<Integer>(Arrays.asList(4,2,5,1,6,3,7));
        indexMapping = IntStream.range(0, inorder.size()).boxed().collect(Collectors.toMap(inorder::get,i->i));
        Btree root = getTreeFromInorderAndPreOrder(preorder, inorder, 0, inorder.size()-1);
        Btree.levelOrderTraversal(root);
    }

    public static Btree getTreeFromInorderAndPreOrder(List<Integer> preorder, List<Integer> inorder, int start, int end){
        if(start>end)
            return null;

        int element = preorder.get(start);
        Btree root =  new Btree(preorder.get(preIndex));
        int rootIndex = indexMapping.get(preorder.get(preIndex));
        preIndex++;
        if(start==end){
            return root;
        }
        root.left =  getTreeFromInorderAndPreOrder(preorder, inorder, start, rootIndex-1);
        root.right = getTreeFromInorderAndPreOrder(preorder, inorder, rootIndex+1, end);
        return root;
    }

}
