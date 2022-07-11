package Week2.class_08;

public class Ques06 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,1};
        peakEle(arr);
    }
    public static void peakEle(int[] nums){
        int ans=0;
        int peak = nums[0];
        for(int i=1;i<nums.length;i++){
            if(peak<nums[i]){
                peak = nums[i];
                ans=i;
            }
        }
        System.out.print(ans);
    }
}
