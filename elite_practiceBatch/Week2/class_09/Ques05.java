package Week2.class_09;

public class Ques05 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,7};
        int target=10;
        twoSum(arr,target);
    }
    public static void twoSum(int[] nums,int t){
        int st=0;int end = nums.length-1;
        while(st<end){
            int currsum =nums[st]+nums[end];
            if(currsum<t){
                st++;
            }
            else if(currsum >t){
                end--;
            }
            else{
                System.out.print((st) +" " +(end));
                break;
            }
        }
    }
}
