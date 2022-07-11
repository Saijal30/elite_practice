package Week2.class_08;
import java.util.*;
public class Ques02 {
    public static void main(String[] args) {
        int rows=2;
        generate(rows);
    }
    public static void generate(int row) {
        List<Integer> list1 = new ArrayList<Integer>();
        for(int i=0;i<=row;i++){
            List<Integer> list2 = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    list2.add(1);
                }
                else{
                    list2.add(list1.get(j)+list1.get(j-1));
                }
                

            }
            list1= list2;
           
        }
        System.out.print(list1);
    }
    
}
