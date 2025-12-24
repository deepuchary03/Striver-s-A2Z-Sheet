package Basics;
public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(char c= 'A';c<='A'+i;c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }
}
