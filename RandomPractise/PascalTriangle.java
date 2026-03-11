package RandomPractise;

import java.util.ArrayList;
import java.util.List;
public class PascalTriangle {
    public static void main(String[] args){
        int n=5;
         List<List<Integer>> arr=new ArrayList<>();

        ArrayList<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        arr.add(firstRow);
        for(int i=1;i<n;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++){
                temp.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
            }


            temp.add(1);
            arr.add(temp);

        }
        for(List<Integer> k:arr){
            for(int i:k) System.out.print(i+" ");
            System.out.println();
        }
    }
}
