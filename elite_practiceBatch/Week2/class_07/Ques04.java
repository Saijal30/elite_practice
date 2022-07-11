package Week2.class_07;

public class Ques04 {
    public static void main(String[] args) {
        int[] arr= {10,2,4,-1,9,3};
        maxMin(arr);
    }
    
    public static void maxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);
    }
}
