package StackandQueues;
// Input: nums = [1,2,1]
// Output: [2,-1,2]
// Explanation: The first 1's next greater number is 2; 
// The number 2 can't find next greater number. 
// The second 1's next greater number needs to search circularly, which is also 2.
import java.util.*;
public class NextGreaterElement2 {
    public static void main(String args[]){
        int[] arr={1,2,1};
        
        Stack<Integer> st=new Stack<>();
        int n=arr.length;

        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--) st.push(arr[i]);
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(arr[i]);
        }
        for(int i:ans) System.out.print(i+" ");
    }
}
