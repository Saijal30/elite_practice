package Week3.class_15;

public class Ques01 {
    public static void main(String[] args) { 
        int arr[] ={0,1,0,3,12};
         
          moveZeroes(arr); 
         
    }
        public static  void moveZeroes (int[] nums) {
             int i=0; 
             for(int j=1;j<nums.length; j++) { 
                if (nums[i]!=0){ i++;
            
                }
            
            else if(nums[j]!=0){
                 nums[i++]=nums[j];
            
            nums[j] = 0;
            }
         }
         for(int ele:nums){
            System.out.print(ele+" ");
         }
        }
    }