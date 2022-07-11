package Week1.class_05;
import java.util.*;
public class Ques02 {
    public static void main(String[] args) {
        int[] arr= {10,2,4,7,9,3};
        int k=10;
      targetPairSum(arr,k);
      
    }
    public static void targetPairSum(int[] arr,int tar){
       int en= arr.length-1,st=0;
       Arrays.sort(arr);
       while(st<en){
           if(arr[st]+arr[en]<tar){
               st++;
           }
           else if(arr[st]+arr[en]>tar){
               en--;
           }
           else{
               System.out.println(arr[st]+" "+arr[en]);
               break;
           }
       }
    }
}
