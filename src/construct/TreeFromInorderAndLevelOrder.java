package construct;
//Given inorder and level-order traversals of a Binary Tree,
// construct the Binary Tree. Following is an example to illustrate the problem

import introduction.Btree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TreeFromInorderAndLevelOrder {

    public static void main(String [] args){
        List<Integer> preorder = new ArrayList<Integer>(Arrays.asList(1,2,4,5,3,6,7));
        List<Integer> inorder = new ArrayList<Integer>(Arrays.asList(4,2,5,1,6,3,7));
    }

}
