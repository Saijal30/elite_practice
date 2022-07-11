package Week1.class_03;

public class Ques02 {
    public static void main(String[] args) {
        countDigits(16382);
      }
      public static void countDigits(int n){
          int count=0;
          while(n>0){
              count++;
              n/=10;
          }
         System.out.println(count);
      }
}
