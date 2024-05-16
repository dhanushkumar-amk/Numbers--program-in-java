public class DuckNumber {
    public static void main(String[] args) {
        int n = 400;
        int m = n;
        int count = 0;

        while (m != 0) {
            int d = m % 10;
            if (d == 0)
                count++;
            m /= 10;
        }
        if (count > 0) {
            System.out.println("It is a duck number :" + n);
        } else {
            System.out.println("It is a not a duck Number :" + n);
        }
    }
}
