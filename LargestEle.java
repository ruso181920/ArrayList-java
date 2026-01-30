import java.util.ArrayList;

public class LargestEle {
    public static void main(String[] args) {
     ArrayList<Integer>list=new ArrayList<>();

       list.add(2);
       list.add(5);
       list.add(7); 
       list.add(5);
       list.add(9);
       list.add(8);
       int max=list.get(0);
       for (int i = 1; i < list.size(); i++) {
        //    if(max<list.get(i)) {
        //     max=list.get(i);
        //    }

        // or we can write 
        max=Math.max(max,list.get(i));
       }
       System.out.println("Largest element is : "+max);
    }
}
