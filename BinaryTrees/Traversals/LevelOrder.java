package BinaryTrees.Traversals;
// Input : root = [3, 9, 20, null, null, 15, 7]
import java.util.*;
// Output : [ [3] , [9, 20] , [15, 7] ]
public class LevelOrder {
    public static ArrayList<ArrayList<Integer>> levelorder(TreeNode root){
    ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    level(root,ans);
    return ans;
}
public static void level(TreeNode root,ArrayList<ArrayList<Integer>> ans)

{
    Queue<TreeNode> q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        int size=q.size();
        ArrayList<Integer> sub=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode temp=q.poll();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            sub.add(temp.val);
        }
        ans.add(sub);
    }

}
   public static void main(String[] args) {
        Integer[] arr={3, 9, 20, null, null, 15, 7};// input

        TreeNode root=buildTree(arr);
        System.out.println(levelorder(root));// output 
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


