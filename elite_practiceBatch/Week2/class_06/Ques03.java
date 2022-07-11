package Week2.class_06;

public class Ques03 {
    public static void main(String[] args) {
        int[] arr= {0,1,0,2,1,0,1,3,2,1,2,1};
        
        trappingRainW(arr);
      
    }
    public static void trappingRainW(int[] arr){
      int n=arr.length;
      int[] lmax= new int[n];
      int[] rmax = new int[n];
      int ans=0;
      lmax[0]=arr[0];
     for(int i=1;i<n;i++){
         lmax[i]=Math.max(arr[i],lmax[i-1]);
     }
     rmax[n-1]= arr[n-1];
     for(int i=n-2;i>=0;i--){
         rmax[i]=Math.max(arr[i],rmax[i+1]);
     }
     for(int i=0;i<n;i++){
         int minWall= Math.min(lmax[i],rmax[i]);
         if(minWall>arr[i]){
             ans+=minWall-arr[i];
         }
     }
      
      System.out.println(ans);
       
    }
}
