package Week3.class_11;

public class Ques04 {
    public static void main(String[] args){
        int[] nums={1,2,3,3,3,4,7,9};
        int k=3;
        kIndex(nums, k);
    }

    public static void kIndex(int[] nums,int target){
        int ans1 = firstSearch(nums,target,0,nums.length-1);
        int ans2 = secondSearch(nums,target,0,nums.length-1);
        System.out.println("first "+ans1);
        System.out.println("second "+ans2);
        
    }
    public static int firstSearch(int[] arr,int target,int left,int right){
        int ans=-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]>=target){
                right =mid-1;
            }
            if(arr[mid]==target){
                ans=mid;
            }
            else if(arr[mid]<target){
                left = mid+1;
            }
        }
        return ans;
    }
     public  static int secondSearch(int[] arr,int target,int left,int right){
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>target){
                right =mid-1;
            }
            else if(arr[mid]<=target){
                left= mid+1;
            }
            if(arr[mid]==target){
                ans=mid;
            }
        }
        return ans;
     }

}
