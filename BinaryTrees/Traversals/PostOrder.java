package BinaryTrees.Traversals;
// Input : root = [1, 4, null, 4, 2]

// Output : [4, 2, 4, 1]
import java.util.*;
public class PostOrder {
 public static ArrayList<Integer> postorder(TreeNode root){
        ArrayList<Integer> ans=new ArrayList<>();
        post(root,ans);
        return ans;
    }
    public static void post(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return;
        post(root.left,ans);
        post(root.right,ans);
        ans.add(root.val);
    }
    
    
    

    public static void main(String[] args) {
        Integer[] arr={1, 4, null, 4, 2};// input

        TreeNode root=buildTree(arr);
        System.out.println(postorder(root));// output 
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


