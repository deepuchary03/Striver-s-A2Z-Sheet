package StackandQueues;


// previous smaller 
// Input:  [4, 5, 2, 10, 8]
//         [-1, 4, -1, 2, 2]
// index=  [ -1,0, -1 2  2]
import java.util.*;
public class PrevSmallerElementIndex {
    public static void main(String args[]){
        int nums[]={4,5,2,10,8};
        int n=nums.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(st.size()>0 && nums[st.peek()]>= nums[i]) st.pop();
            ans[i]=st.size()==0?-1:st.peek();
            st.push(i);
        }
        for(int i:ans) System.out.print(i+" ");
        
    }
}
