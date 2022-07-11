package Week2.class_06;

public class Ques2 {
   
        public static void main(String[] args) {
            int[] arr= {-1,-6,2,4,-1,9,3};
            
            largestSub(arr);
          
        }
        public static void largestSub(int[] arr){
          int maxSum =Integer.MIN_VALUE;
         int curSum=0,st=0,en=0;
          for(int i=0;i<arr.length;i++){
              curSum+=arr[i];
              if(maxSum<curSum){
                  maxSum = curSum;
                  en =i;
              }
              if(curSum<0){
                  curSum=0;
                  st=i+1;
              }
          }
          System.out.println(maxSum+" start:"+st+" end: "+en);
           
        }
    
}
