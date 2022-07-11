package Week2.class_08;
import java.util.*;
public class Ques01 {
    public static void main(String[] args) {
        int rows=5;
        generate(rows);
    }
    public static void generate(int numRows) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        List<Integer> list1 = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++){
            List<Integer> list2 = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list2.add(1);
                }
                else{
                    list2.add(list1.get(j)+list1.get(j-1));
                }
            }
            list1=list2;
            result.add(list2);
        }
        System.out.print(result);
    }
    
}
