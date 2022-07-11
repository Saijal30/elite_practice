package Week1.class_04;

public class Ques07 {
    public static void main(String[] args) {
        triangleRevnum(5);
        
      }
      public static void triangleRevnum(int n){
         int sum=2,val=1;
         for(int i=0;i<n;i++){
             int temp=val;
             for(int j=0;j<i+1;j++){
                 System.out.print(val+" ");
                 val--;
             }
            val=temp+sum;
            sum++;
             System.out.println();
         }
         
      }
}
