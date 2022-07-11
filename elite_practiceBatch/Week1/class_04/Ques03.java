package Week1.class_04;

public class Ques03 {
    public static void main(String[] args) {
        numberTriangle2(5);
        
      }
      public static void numberTriangle2(int n){
         
         for(int i=0;i<n;i++){
             int val=1;
             for(int j=0;j<i+1;j++){
                  System.out.print(val+" ");
                  val++;
             }
             System.out.println();
         }
         
      }
}
