package Week2.class_07;

import java.util.*;

public class Ques01 {
    public static void main(String[] args) {
        int[] arr1= {-1,0,3,6};
        int[] arr2 = {1,5,9,11,50};
        mergeSorted(arr1,arr2);
    }
    public static void mergeSorted(int[] arr1,int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int pt1=0 ,pt2=0;
        while(pt1<arr1.length &&pt2<arr2.length){
            if(arr1[pt1]<arr2[pt2]){
                list.add(arr1[pt1]);
                pt1++;
            }
            else{
                list.add(arr2[pt2]);
                pt2++;
            }
        }
        while(pt1<arr1.length){
            list.add(arr1[pt1]);
            pt1++;
        }
        while(pt2<arr2.length){
            list.add(arr2[pt2]);
            pt2++;
        }
        System.out.println(list);
    }
}
