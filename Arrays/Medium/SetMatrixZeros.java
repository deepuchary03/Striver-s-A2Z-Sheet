package Arrays.Medium;
// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]

import java.util.ArrayList;

// Output: [[1,0,1],[0,0,0],[1,0,1]]
public class SetMatrixZeros {
    public static void main(String args[]){
        int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    arr1.add(i);
                    arr2.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(arr1.contains(i) || arr2.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }

        for(int[] i:matrix){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    
}
