package Week1.class_03;

public class Ques06 {
    public static void main(String[] args) {
        isPrime(16);
        
      }
      public static void isPrime(int n){
          int count=0;
          for(int i=1;i<=n;i++){
              if(n%i==0){
                  count++;
              }
          }
          if(count==2){
              System.out.println("Prime");
          }
          else{
              System.out.println("Non Prime");
          }
         
  }
}
