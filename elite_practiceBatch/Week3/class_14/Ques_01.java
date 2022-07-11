package Week3.class_14;

public class Ques_01 {

    public static void main(String[] args){
        int[] gas={1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.print(canCompleteCircuit (gas,cost));
    }

    public static int canCompleteCircuit (int[] gas, int[] cost) { 
        int start=0, previous=0, current=0;
        
        for(int i=0;i<gas.length;i++){
             current+=(gas[i]-cost[i]);
        
                if(current<0) {
                start=i+1;
                previous+=current;
                 current=0;}
        
        }
        
       
        
        return ((previous+current)>=0)?start: -1;
        
        }
}
