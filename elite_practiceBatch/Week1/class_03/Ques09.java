package Week1.class_03;

public class Ques09 {
    public static void main(String[] args) {
        fibn(5);
        
      }
      public static void fibn(int n){
         int n1 =0;
         int n2= 1;
         System.out.println(n1);
         System.out.println(n2);
         for(int i=3;i<=n;i++){
             int n3 = n1+n2;
             n1=n2;
             n2=n3;
             System.out.println(n3);
         }
         
      }
  
}
