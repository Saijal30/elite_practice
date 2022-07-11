package Week1.class_03;

public class Ques05 {
    public static void main(String[] args) {
        armstrong(153);
        //153=1^3 +5^3 +3^3;
      }
      public static void armstrong(int n){
          int digits = countDigits(n);
          int sum=0;
          int temp=n;
          while(temp>0){
           sum+= Math.pow(temp%10,digits);
           temp/=10;
          }
          if(n==sum){
              System.out.println(true);
          }
          else{
              System.out.println(false);
          }
        }

        public static int countDigits(int n){
            int count=0;
            while(n>0){
                count++;
                n/=10;
            }
           return count;
        }
         
}
    