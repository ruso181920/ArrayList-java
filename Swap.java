
import java.util.ArrayList;
import java.util.Scanner;

public class Swap {
    public static void main(String args []) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(5);
         list.add(7); 
       list.add(5);
       list.add(9);
       list.add(8);
       System.out.println(list);

       Scanner inp=new Scanner(System.in);
       System.out.print("Enter index1 to change : ");
       int i=inp.nextInt();
       System.out.print("Enter index2 to change : ");
       int j=inp.nextInt();
       
       int temp=list.get(i);
       list.set(i, list.get(j));
       list.set(j, temp);
       System.out.println(list);

    }
    
}
