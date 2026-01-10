package BinaryTrees.Medium;
import java.util.*;
// Input : [3, 9, 20, null, null, 15, 7]

// Output : Yes

public class BalancedTree {

    public static boolean balanced(TreeNode root){
        return bal(root)!=-1;
    }
    public static int bal(TreeNode root){
        if(root==null) return 0;
        int lh=bal(root.left);
        if(lh==-1) return -1;
        int rh=bal(root.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return 1+Math.max(lh,rh);
    }

    public static void main(String[] args) {
        Integer[] arr={3, 9, 20, null, null, 15, 7};// input

        TreeNode root=buildTree(arr);
        System.out.println(balanced(root));// output 
    }
    public static TreeNode buildTree(Integer[] arr) {
            if (arr.length == 0 || arr[0] == null) return null;
            TreeNode root = new TreeNode(arr[0]);
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            int i = 1;
            while (i < arr.length) {
                TreeNode curr = q.poll();
    
                if (i < arr.length && arr[i] != null) {
                    curr.left = new TreeNode(arr[i]);
                    q.add(curr.left);
                }
                i++;
    
                if (i < arr.length && arr[i] != null) {
                    curr.right = new TreeNode(arr[i]);
                    q.add(curr.right);
                }
                i++;
            }
            return root;
        }
}

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}


