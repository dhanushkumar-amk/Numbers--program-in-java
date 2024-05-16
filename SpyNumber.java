/**
 * SpyNumber
 */
public class SpyNumber {

    public static void main(String[] args) {
        int n = 123;
        int m = n;
        int sum = 0;
        // for multiplication purpose we assign product as 1
        int product = 1;

        while (m != 0) {

            int d = m % 10;
            sum += d;
            product *= d;
            m /= 10;
        }

        if (sum == product)
            System.out.println("Is a spy Number :" + n);
        else
            System.out.println("Is not spy number :" + n);
    }

}