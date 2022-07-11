package Week1.class_02;

public class Ques04 {
    public static void main(String[] args) {

        evenodd();
    }

    public static void evenodd() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even " + i);
            } else {
                System.out.println("Odd " + i);
            }
        }

    }
}
