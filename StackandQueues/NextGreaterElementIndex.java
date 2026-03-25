package StackandQueues;
// Input: arr = [4, 8, 5, 2, 25]
//              [2, 5, 2, -1, -1]
// index         3  2  3   5   5
import java.util.Stack;

public class NextGreaterElementIndex {
    public static void main(String args[]){
        int[] nums={4,8,5,2,25};
       Stack<Integer> st=new Stack<>();
       int n=nums.length;
       int[] ans=new int[n];
       for(int i=n-1;i>=0;i--){
           while(st.size()>0 && nums[st.peek()] >= nums[i]) st.pop();
           if(st.size()==0) ans[i]=n;
           else ans[i]=st.peek();
           st.push(i);
       }
       
       for(int i:ans) System.out.print(i+ " ");
    }
}
