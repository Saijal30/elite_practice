package Week1.class_04;

public class Ques01 {
    public static void main(String[] args) {
        starTriangle(5);
        
      }
      public static void starTriangle(int n){
         
         for(int i=0;i<n;i++){
             for(int j=0;j<i+1;j++){
                  System.out.print("* ");
             }
            
             System.out.println();
         }
         
      }
  
}
