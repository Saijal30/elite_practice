package Week2.class_10;

public class Ques01 {
    public static void main(String[] args) {
        int[] arr={1,0,2};
        nextPer(arr);
    }
    public static void nextPer(int[] nums){
        int index=-1,n=nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                index=i-1;
                break;
            }
        }
        if(index==-1){
            int i=0,j=nums.length-1;
            while(i<j){
                int temp =nums[i];
                nums[i]= nums[j];
                nums[j] =temp;
                i++;j--;
            }
            return;
        }
        int j=n-1;
        for(int i=n-1;i>=index+1;i++){
            if(nums[i]>nums[index]){
                j=i;break;
            }
        }
        int temp=nums[j];
        nums[j]=nums[index];
        nums[index] =temp;
        index++;
        int last = nums.length-1;
        while(index<last){
            temp=nums[last];
            nums[last]=nums[index];
            nums[index]=temp;
            index++;
            last--;
        }
        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
    
}
