package Week1.class_02;

public class Ques03 {
    public static void main(String[] args) {

        reverse(1889);
    }

    public static void reverse(int n) {
        int ans = 0;
        while (n > 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        System.out.println(ans);
    }
}
