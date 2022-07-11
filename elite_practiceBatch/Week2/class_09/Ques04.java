package Week2.class_09;
import java.util.*;
public class Ques04 {
   

    public static void main(String[] args) {
        int[] arr={2,3,4,5,3,1};
        int[] arr2 = {2,4,0,8,2};
        median(arr,arr2);
    }
    public static void median(int[] nums1,int[] nums2){
        int[] arr = merge(nums1,nums2);
        int arrl = arr.length;
        double ans =0;
        if(arrl%2 ==0){
            ans = (arr[arrl/2 -1]+arr[arrl/2])/2.0;
        }
        else ans=arr[arrl/2];

        System.out.println(ans);
    }
    public static int[] merge(int[] nums1,int[] nums2){
        int m= nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        int index=0;
        for(int i=0;i<m;i++){
            arr[index++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[index++] = nums2[i];
            
        }
        Arrays.sort(arr);
        return arr;
    }

}
