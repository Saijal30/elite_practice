package Week2.class_09;
import java.util.*;
public class Ques03 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,3,1};
        int[] arr2 = {2,4,0,8,2};
        intersection(arr,arr2);
    }
    public static void intersection(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else j++;
        }
        System.out.print(list);
    }
}
