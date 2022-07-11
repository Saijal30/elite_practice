package Week3.class_13;

public class Ques_01 {
   

public static void main(String[] args){
    int[] nums1={1,3};
    int[] nums2 = {2};
    System.out.print(findMedianSortedArrays(nums1,nums2));
}

public  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
     if(nums1.length<nums2.length){

        return median(nums1,nums2);}
        else{return median(nums2,nums1);}
     
}
public static double median (int[] arr1,int[] arr2){
    int start =0;
    int end = arr1.length;
    int n = arr1.length;
    int m = arr2.length;
    int L1,L2,R1,R2;
    while(start <=end){
        int cut1 = (start +end)/2;
        int cut2  = ((n+m+1)/2) - cut1;

        if(cut1!=0){
            L1=arr1[cut1-1];
        }
        else{
            L1= Integer.MIN_VALUE;
        }

        if(cut2!=0){
            L2 = arr2[cut2-1];

        }
        else{
            L2=Integer.MIN_VALUE;
                }
       
        if(cut1==n){
            R1=Integer.MAX_VALUE;
        }        
        else R1= arr1[cut1];

        if(cut2==m) R2 = Integer.MAX_VALUE;
        else R2= arr2[cut2];

        if(L1<=R2 && L2<=R1){
            if((n+m)%2 ==0) return (Math.max(L1, L2)+Math.min(R1, R2))/2.0;
            else return Math.max(L1,L2);
        }
        if(L1>R2){
            end =cut1-1;
        }
        else start= cut1+1;
    }
    return 0.0;
}



}