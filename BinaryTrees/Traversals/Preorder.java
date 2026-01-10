package BinaryTrees.Traversals;
import java.util.*;
// Input : root = [1, 4, null, 4 2]
// Output : [1, 4, 4, 2]
public class Preorder {
    public static ArrayList<Integer> preorder(TreeNode root){
        ArrayList<Integer> ans=new ArrayList<>();
        pre(root,ans);
        return ans;
    }
    public static void pre(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        pre(root.left,ans);
        pre(root.right,ans);
    }
    
    
    

    public static void main(String[] args) {
        Integer[] arr={1, 4, null, 4, 2};
        TreeNode root=buildTree(arr);
        System.out.println(preorder(root));
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

