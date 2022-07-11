package Week2.class_07;

public class Ques02 {
    public static void main(String[] args) {
        int[] arr= {1,0,2,5,3,3,3,2,2,3};
        
        majorityELe(arr);
      
    }
    public static void majorityELe(int[] arr){
        int count =1;
        int majidx =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[majidx]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                count=1;
                majidx=i;
            }
        }
        System.out.println(arr[majidx]);
    }
}
