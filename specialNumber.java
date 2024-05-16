public class specialNumber {
    public static void main(String[] args) {
        int n = 59;

        int m = n;

        int sum = 0;
        int product = 1;

        while (m != 0) {
            int d = m % 10;
            sum += d;
            product *= d;
            m /= 10;
        }
        if (sum + product == n)
            System.out.println("It is a special Number :" + n);
        else
            System.out.println("It is Not a Special Number :" + n);
    }
}
