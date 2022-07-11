package Week3.class_15;
import java.util.*;
public class Ques02 {
     public static void main(String[] args) { 
        String arr[] ={ "mobile","mouse","moneypot","monitor","mousepad"};
         String search ="mouse";
       System.out.print( suggestedProducts(arr,search)); 
         
    }

    public static List<List<String>> suggestedProducts(String[] products,String searchword){
        int n = searchword.length();
        int fixed = 3;
        List<List<String>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            result.add(new ArrayList<String>());
        }
        Arrays.sort(products);
        for(String str:products){
            for(int i=0;i<n;i++){
                if(i<str.length()&& str.charAt(i)==searchword.charAt(i)){
                    if(result.get(i).size()<fixed){
                        result.get(i).add(str);
                    }
                }
                else{break;}

            }
        }
        return result;
    }
}
