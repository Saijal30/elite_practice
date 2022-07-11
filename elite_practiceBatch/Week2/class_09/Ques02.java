package Week2.class_09;
import java.util.*;
public class Ques02 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,3,1};
        int[] arr2 = {2,4,0,8,2};
        intersection(arr,arr2);
    }
    public static void intersection(int[] nums1,int[] nums2){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        List<Integer> list =new ArrayList<>();
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                list.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        System.out.println(list);
    }
}
