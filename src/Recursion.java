/**
 * Created by Developer on 4/24/2017.
 */
public class Recursion {

    public static double power(double x, int n) {
        if (n == 0)    //anchor
            return 1.0;
        return x * power(x, n - 1); //inductive step
    }

    public static long factorial(long n) {
        if (n == 0L)
            return 1L;
        return n * factorial(n - 1);
    }

    public static long fib(long n) {
        if (n<2L)
            return n;
        return fib(n-2) + fib(n-1);
    }
}
