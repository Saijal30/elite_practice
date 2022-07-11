package Week1.class_03;

public class Ques07 {
    public static void main(String[] args) {
        isPrime(16);

    }

    public static void isPrime(int n) {
        int flag = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Non Prime");
        }

    }

}
