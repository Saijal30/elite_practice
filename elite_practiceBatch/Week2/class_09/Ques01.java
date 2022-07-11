package Week2.class_09;

public class Ques01 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,3,1};
        jump(arr);
    }
    public static void jump(int[] nums){
        int k= nums.length-1;
        int count=0;
        while(k!=0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=k){
                    k=i;
                    count++;
                    break;
                }
            }
        }
        System.out.print(count);
    }


}    