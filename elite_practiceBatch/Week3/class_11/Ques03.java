package Week3.class_11;

public class Ques03 {
    public static void main(String[] args){
        int[] nums={9,7,5,3,1};
        int k=3;
        kIndex(nums, k);
    }

    public static void kIndex(int[] arr,int k){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]>k){
                start=mid+1;
            }
            else if(arr[mid]<k){
                end = mid-1;
            }
            else{
                System.out.println("index "+mid);
                break;
            }
        }
    }   
}
