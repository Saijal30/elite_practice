package Week2.class_07;

import java.util.*;

public class Ques05 {
    public static void main(String[] args) {
        int[] arr= {10,2,4,-1,9,3};
        
       sortedSquar(arr);     
    }
    public static void sortedSquar(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
    
}
