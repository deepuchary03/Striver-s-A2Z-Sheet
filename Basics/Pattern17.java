package Basics;

public class Pattern17 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                System.out.print("-");
            }
            char ch='A';
            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<((2*i)+1)/2) ch++;
                else ch--;
            }


            System.out.println();
        }
    }
}
