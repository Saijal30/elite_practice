package Week3.class_11;

import java.util.Random;

class Solution{
    int[] arr;
    public Solution(int[] nums){
        arr=nums;
    }
    public int[] reset(){
        return arr;
    }
    public int[] shuffle(){
        int[] sflarr = arr.clone();
        for(int i=sflarr.length-1;i>0;i--){
            int rindx = new Random().nextInt(i+1);
            int temp = sflarr[i];
            sflarr[i] =sflarr[rindx];
            sflarr[rindx] = temp;
        }
        return sflarr;
    }
}



public class Ques_01 {
    
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        Solution obj = new Solution(nums);
        int[] param_1 = obj.reset();
        int[] param_2 = obj.shuffle();
        System.out.println("After reset");
        for(int ele:param_1){
            System.out.print(ele+ " ");
        }
        System.out.println();
        System.out.println("After shuffle");
        for(int ele:param_2){
            System.out.print(ele+ " ");
        }


    }
    
}
