package Recursion;
// 0 1 1 2 3 5 8 13 21 34 55
public class Fibonacci {
    public static int fib(int n){
        if(n==0||n==1) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String a[]){
        System.out.println("Nth fibonacci: "+fib(8));

        System.out.println("Nth fibonacci: "+fib(10));
    }
}
