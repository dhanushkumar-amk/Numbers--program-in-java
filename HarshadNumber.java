public class HarshadNumber {
    public static void main(String[] args) {
        int n = 156;
        int m = n;
        int sum = 0;
        while (m != 0) {
            int d = m % 10;
            sum += d;
            m /= 10;
        }
        if (n % sum == 0) {
            System.out.println("Its a Harshad Number :" + n);
        } else {
            System.out.println("Its not Hrshad Number :" + n);
        }
    }
}
