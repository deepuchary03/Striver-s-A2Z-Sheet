package Recursion.SubsequencePatterns;

import java.util.ArrayList;
import java.util.*;

// Input: arr[] = [1, 5, 6]
// Output: [[], [1], [1, 5], [1, 5, 6], [1, 6], [5], [5, 6], [6]]
// Explanation: The number of all the possible subsets will be 2n.
public class Subsets2 {
    public static void main(String args[]){
        int arr[]={1, 5, 6};
        System.out.println(findsub(arr));
    }
    public static ArrayList<ArrayList<Integer>> findsub(int[] arr) {
       Arrays.sort(arr);
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       backtrack(0,arr,new ArrayList<Integer>(),ans);
       return ans;
        
    }
    public static void backtrack(int i,int[] arr,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>>ans){
        if(i==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
            
        }
        temp.add(arr[i]);
        backtrack(i+1,arr,temp,ans);
        temp.remove(temp.size()-1);
        int j=i+1;
        while(j<arr.length && arr[i]==arr[j]) j++;
        backtrack(j,arr,temp,ans);
    }
}
