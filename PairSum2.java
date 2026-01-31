
// Sorted and rotated array

import java.util.ArrayList;

public class PairSum2 {
    public static boolean PairSum(ArrayList<Integer>list ,int key) {
        int breakPoint=-1;
        int n=list.size();

       for (int i = 0; i < list.size(); i++) {
           if(list.get(i)>list.get(i+1)) {
            breakPoint=i;
            break;
           }
       }
       int lp=breakPoint+1;
       int rp=breakPoint;
        while(lp!=rp) {
            //case 1
            if(list.get(lp)+list.get(rp)==key) {
                System.out.println("pairs are: "+list.get(lp)+ " , "+list.get(rp));
                return true;
            }

            //case 2
            if(list.get(lp)+list.get(rp)<key) {
                lp=(lp+1)%n;

            }else {
                //case 3
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         ArrayList<Integer>list=new ArrayList<>();
         list.add(11);
         list.add(15);
         list.add(6);
         list.add(8);
         list.add(9);
         list.add(10);
        

         int target=2;

         System.out.println("PairSum Possible : "+PairSum(list,target));

    } 
}
