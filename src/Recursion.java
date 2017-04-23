/**
 * Created by Developer on 4/24/2017.
 */
public class Recursion {

    public static double power(double x, int n) {
        if (n == 0)    //anchor
            return 1.0;
        return x * power(x, n - 1); //inductive step
    }

    public static void main(String[] args) {

    }
}
