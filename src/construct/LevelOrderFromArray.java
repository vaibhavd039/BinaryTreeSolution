package construct;

import introduction.Btree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LevelOrderFromArray {
    public static void main(String [] args){
        List<Integer> level = new ArrayList<Integer>(Arrays.asList(1,2,4,5,3,6,7));
        Btree root= createLevelOrder(level, 0);
        Btree.levelOrderTraversal(root);
    }

    public static Btree createLevelOrder(List<Integer> arr, int index){
        if (arr.size()==0 || index>=arr.size())
            return null;
        Btree root = new Btree(arr.get(index));
        root.left = createLevelOrder(arr, 2*index+1);
        root.right = createLevelOrder(arr, 2*index+2);

        return root;
    }
}
