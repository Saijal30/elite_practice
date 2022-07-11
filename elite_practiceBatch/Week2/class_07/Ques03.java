package Week2.class_07;

public class Ques03 {
    public static void main(String[] args) {
        int[] arr= {1,3,3,5,6,5,6};
        
        unrepeatedNu(arr);
    }
    public static void unrepeatedNu(int[] arr){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            ans=ans^arr[i];
        }
        System.out.println(ans);
    } 
    
}
