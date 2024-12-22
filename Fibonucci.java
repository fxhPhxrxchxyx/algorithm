public class Fibonucci{
    public static void main(String[] args){
        System.out.printLn(fibo(20));
    }
    public static int fibo(int n){
        if (n <= 1) return 1;
        else return(fibo(n-1)+ fibo(n-2));
    }
}