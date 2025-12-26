package Arrays.Medium;
// Input: matrix = [[1, 2, 3], 
//                  [4 ,5 ,6], 
//                  [7, 8, 9]]

// Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};

        ArrayList<Integer> ans=new ArrayList<>();
        int top=0;
        int left=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
                
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
    for(int i:ans) System.out.print(i+" ");
    }
}
