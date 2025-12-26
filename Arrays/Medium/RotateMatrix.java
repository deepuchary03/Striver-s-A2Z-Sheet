package Arrays.Medium;
// input :
// 1 2 3
// 4 5 6
// 7 8 9
// output: 
// 7 4 1
// 8 5 2
// 9 6 3
public class RotateMatrix {
    public static void main(String a[]){
            int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
            int r=matrix.length;
            int c=matrix[0].length;
            for(int i=0;i<r;i++){
                for(int j=0;j<=i;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
            for(int i=0;i<r;i++){
                for(int j=0;j<c/2;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[i][r-j-1];
                    matrix[i][r-j-1]=temp;

                }
            }

            for(int[] i:matrix){
                for(int j:i){
                    System.out.print(j+" ");
                }System.out.println();
            }
    }
}
