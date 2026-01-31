import java.util.ArrayList;

// brute force approch

public class PairSum {
    
    public static boolean PairSum(ArrayList<Integer>list ,int key) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size(); j++) {
                if(list.get(i)+list.get(j)==key) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
         ArrayList<Integer>list=new ArrayList<>();
         list.add(1);
         list.add(8);
         list.add(6);
         list.add(2);
         list.add(5);
         list.add(4);
         list.add(8);
         list.add(3);
         list.add(7);
         int target=12;

         System.out.println("PairSum Possible : "+PairSum(list,target));

    }  
    }

