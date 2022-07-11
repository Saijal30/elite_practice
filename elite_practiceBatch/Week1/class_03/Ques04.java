package Week1.class_03;

public class Ques04 {
    public static void main(String[] args) {
        palindrome(19891);
      }
      public static void palindrome(int n){
          int rev = reverse(n);
          if(n==rev){
         System.out.println(true);
        }
        else{
        System.out.println(false);
          }
      }
      public static int reverse(int n){
          int rev =0;
          while(n>0){
              rev = rev*10 +n%10;
              n/=10;
          }
          return rev;
      }   
}
