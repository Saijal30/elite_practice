package Week1.class_04;

public class Ques04 {
    public static void main(String[] args) {
        reverseTriangle(5);
        
      }
      public static void reverseTriangle(int n){
         int space=n;
         for(int i=0;i<n;i++){
             for(int j=0;j<i+1;j++){
                 System.out.print(" ");
             }
             for(int j=0;j<space;j++){
                  System.out.print("* ");
             }
             space--;
             System.out.println();
         }
         
      }
}
