package Week3.class_12;

public class Ques01 {
    public static void main(String[] args) {
    
    int[] arr ={23,2,4,6,7};
    int  k = 6;
    System.out.print(checkSubarraySum(arr,k));
    }

    public static boolean checkSubarraySum(int[] nums,int k){
        int prefixsum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                if(nums[i]==0||nums[i]%k==0){
                    return true;
                }
            }
            prefixsum +=nums[i];
            if(prefixsum%k ==0)return true;
            int temp = prefixsum;
            int left_pos =0;

            while(temp>=k && i-left_pos>1){
                temp -=nums[left_pos++];
                if(temp%k ==0){
                    return true;
                }
            }
           

        }
        return false;
    }
}
