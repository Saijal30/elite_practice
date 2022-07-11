package Week1.class_04;

public class Ques05 {
    public static void main(String[] args) {
        bigTriangle(5);
        
      }
      public static void bigTriangle(int n){
         int space=n-1;
         for(int i=0;i<n;i++){
             for(int j=0;j<space;j++){
                 System.out.print(" ");
             }
             for(int j=0;j<i+1;j++){
                  System.out.print("* ");
             }
             space--;
             System.out.println();
         }
         
      }
}
