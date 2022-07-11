package Week1.class_02;

class Ques01 {
    public static void main(String[] args) {
        // Sum of 10 natural numbers :
        sum();
    }

    public static void sum() {
        int ans = 0;
        for (int i = 1; i <= 10; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}