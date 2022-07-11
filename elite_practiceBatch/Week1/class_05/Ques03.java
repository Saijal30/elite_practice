package Week1.class_05;

public class Ques03 {
    public static void main(String[] args) {
        int[] arr= {10,2,4,7,9,3};
        
      buySell(arr);
      
    }
    public static void buySell(int[] arr){
      int currMin = arr[0];
      int maxProfit =0;
      for(int i=1;i<arr.length;i++){
          if(arr[i]>currMin){
              int profit =arr[i]-currMin;
              maxProfit=Math.max(maxProfit,profit);
          }
          currMin=Math.min(currMin,arr[i]);
      }
      System.out.println(maxProfit);
       
    }
}
