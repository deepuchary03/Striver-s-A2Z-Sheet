package Basics;
public class Pattern15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n-1;i>=0;i--){
            for(char c= 'A';c<='A'+i;c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }
}
