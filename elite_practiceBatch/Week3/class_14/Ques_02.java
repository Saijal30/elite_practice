package Week3.class_14;
import java.util.*;
public class Ques_02 {
    public static void main(String[] args) { 
        int arr[] ={3, 4, 1, 9, 56, 7, 12};
         int m = 5;
          int ans =findMinimum (arr,m, arr.length); 
          System.out.println(ans);
        }



    public static int findMinimum (int[] arr, int m, int n){

        if(m==0 || n==0){
        return 0;
        }

    if (n < m){ return -1;}



    Arrays.sort(arr);
     int ans = Integer.MAX_VALUE;
    for (int i=0; i<=n-m; i++){
         int diff= arr[i+m-1] - arr[i]; 
         if(diff <ans){ ans =diff; }


    }
    return ans;

    }
}
