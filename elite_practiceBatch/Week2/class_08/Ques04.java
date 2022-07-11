package Week2.class_08;

public class Ques04 {
    public static void main(String[] args) {
        int[] arr = {3,2,6,5,1,0,8};
        runningSum(arr);
    }
    public static void runningSum(int[] nums){
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
    
}
