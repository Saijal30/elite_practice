package Week1.class_03;

public class Ques03 {
    public static void main(String[] args) {
        firstLast(16382);
      }
      public static void firstLast(int n){
          int last=n%10;
          while(n>9){
              n/=10;
          }
         System.out.println("Last "+last);
         System.out.println("First "+n);
      }
}
