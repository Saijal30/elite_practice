package Week4.class_16;

public class Ques_01 {
    private static void painterPartition (int[] arr, int paintersLimit) {
         int low = arr[arr.length-1];
        int high = 0;
        for (int val: arr) {
            high+=val;
        }
        while (low < high) {
            int midTime = low+ (high-low)/2;
            int painterRequired= painterCalculation(arr, midTime);
            if(painterRequired <= paintersLimit){
                high= midTime;
        
            }
        
            else{
            low = midTime+1;
        
            }
        }
        
        System.out.println(low);
        
        }


        private static int painterCalculation (int[] arr, int time) {

            int paintersCount = 1;
            int sum = 0;
            for (int i=0; i< arr.length; i++){
                sum+= arr[i];
                if(sum > time){
            
                    paintersCount++;
                     sum=arr[i];
            
            }
            
            }
            
            return paintersCount;
        }
          
}

