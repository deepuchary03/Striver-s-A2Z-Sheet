package RandomPractise;
import java.util.*;
// input:[5,9,1,8,7]
// output: [[5, 9, 1], [9, 1, 8], [1, 8, 7]]
public class PrintAllKsizeSubarrays {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int arr[]={5,9,1,8,7};
        int k=3;
        for(int i=0;i<arr.length-k+1;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=i;j<i+k;j++){
                temp.add(arr[j]);
            }
            ans.add(temp);
        }
        System.out.println(ans);
    }
}
