package Arrays.Hard;

import java.util.ArrayList;

// Input: N = 5, r = 5, c = 3 
// Output: Element at position (r, c): 6
// N-th row of Pascal’s triangle: 1 4 6 4 1
// First n rows of Pascal’s triangle:
// 1 
// 1 1 
// 1 2 1 
// 1 3 3 1 
// 1 4 6 4 1 
public class PascalTriangle1 {
    public static void main(String args[]){
        int n=5;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> first=new ArrayList<>();
        first.add(1);
        ans.add(first);
        for(int i=1;i<n;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++){
                temp.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
            temp.add(1);
            ans.add(temp);

        }
        
        for(ArrayList<Integer> i:ans){
            for(int j:i){
                System.out.print(j+" ");
            }System.out.println();
        }
        // if they want only nth row 
        System.out.println("if they want only nth row ");
        System.out.println(ans.get(n-1));
    }
}
