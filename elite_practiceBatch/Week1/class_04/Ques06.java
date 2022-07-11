package Week1.class_04;

public class Ques06 {
    public static void main(String[] args) {
        Diamond(7);

    }

    public static void Diamond(int n) {
        int space = n/2, stars = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            if (i < n/2) {
                stars += 2;
                space--;
            } else {
                space++;
                stars -= 2;
            }
            System.out.println();
        }

    }

}
