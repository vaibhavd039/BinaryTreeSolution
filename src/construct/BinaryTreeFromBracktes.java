package construct;
//Construct Binary Tree from String with bracket representation
/*Construct a binary tree from a string consisting of parenthesis and integers.
        The whole input represents a binary tree. It contains an integer followed by zero, one or two pairs of parenthesis.
        The integer represents the root’s value and a pair of parenthesis contains a child binary tree with the same structure.*/


/*
The very first element of the string is the root.
        If the next two consecutive elements are “(” and “)”, this means there is no left child otherwise we will create and add the left child to the parent node recursively.
        Once the left child is added recursively, we will look for consecutive “(” and add the right child to the parent node.
        Encountering “)” means the end of either left or right node and we will increment the start index
        The recursion ends when the start index is greater than equal to the end index
*/

public class BinaryTreeFromBracktes {
    static int start =0;
    public static void main(String [] args){

      String s = "4(2(3)(1))(6(5))";

        // Call the function cunstruct tree
        // to create the tree pass the string;
        Btree root = createTree(s);
        Btree.inOrderTraverse(root);
    }

    public static Btree createTree(String str){
        if(str == null || str.length() ==0){
            return null;
        }
        Character x = str.charAt(start);
        int number = 0;
        while(start<str.length() && Character.isDigit(str.charAt(start))){
            number = number + Character.getNumericValue(str.charAt(start));
            start ++;
        }
            Btree node = new Btree(number);
        if(start>=str.length())
            return node;
        if(start<str.length() && str.charAt(start)=='('){
            start++;
            node.left = createTree(str);
        }
        if(start<str.length() && str.charAt(start)==')'){
                start++;
                return node;
        }


        if(start<str.length() && str.charAt(start)=='('){
            start++;
            node.right = createTree(str);
        }
        if(start<str.length() && str.charAt(start)==')'){
            start++;
            return node;
        }
        return node;
    }

}
