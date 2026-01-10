package BinaryTrees.Medium;
import java.util.*;
// Input: root = [3,9,20,null,null,15,7]
// Output: 3
public class HeightOfTree {

    public static int height(TreeNode root)
    {
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);

        return 1+Math.max(lh,rh);
    }




    public static void main(String[] args) {
        Integer[] arr={3,9,20,null,null,15,7};// input

        TreeNode root=buildTree(arr);
        System.out.println(height(root));// output 
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


