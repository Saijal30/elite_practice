package Week2.class_06;

public class Ques1 {
    public static void main(String[] args) {
        int[] arr= {10,2,4,-1,9,3};
        
        largestSub(arr);
      
    }
    public static void largestSub(int[] arr){
      int maxSum =Integer.MIN_VALUE;
     
      for(int i=0;i<arr.length;i++){
          int sum=0;
          for(int j=i;j<arr.length;j++){
              sum+=arr[j];
              maxSum = Math.max(maxSum,sum);
          }
      }
      System.out.println(maxSum);
       
    }
}
