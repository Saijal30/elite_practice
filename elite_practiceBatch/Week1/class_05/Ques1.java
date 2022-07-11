package Week1.class_05;

public class Ques1 {
    public static void main(String[] args) {
        int[] arr= {10,2,4,7,9,3};
        int k=10;
      targetPairSum(arr,k);
      
    }
    public static void targetPairSum(int[] arr,int tar){
       int n= arr.length;
       for(int i=0;i<n-1;i++){
          for(int j=i+1;j<n;j++){
              if(arr[i]+arr[j]==tar){
                  System.out.println(arr[i]+" "+arr[j]);
              }
          }
       }
       
    }
}
