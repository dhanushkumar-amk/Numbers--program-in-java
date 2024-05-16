public class neonNumber {
    public static void main(String[] args) {
        int n = 9;
        int m = n;

        int sum = 0;
        m = m * m;

        while (m != 0) {
            int d = m % 10;
            sum += d;
            m /= 10;
        }
        if (sum == n)
            System.out.println("it is a neon Number :" + n);
        else
            System.out.println("It is  not a neon Number :" + n);
    }
}
