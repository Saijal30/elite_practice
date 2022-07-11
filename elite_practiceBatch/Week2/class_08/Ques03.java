package Week2.class_08;

public class Ques03 {
    public static void main(String[] args) {
       char[] str ={'d','g','t','l'};
        revString(str);
    }
    public static void revString(char[] s){
        int l=0,r=s.length-1;
        while(l<r){
            char temp = s[l];
            s[l]=s[r];
            s[r] = temp;
            l++;
            r--;
        }
        for(char ele:s){
        System.out.print(ele+ " ");}
    } 
    
}
