
import java.util.ArrayList;

public class TableMdim {
    public static void main(String[] args) {
        ArrayList<ArrayList> mainList=new ArrayList<>();
         ArrayList<Integer> list1=new ArrayList<>();
         ArrayList<Integer> list2=new ArrayList<>();
         ArrayList<Integer> list3=new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list1.add(i*4);
            list2.add(i*23);
            list3.add(i*21);

        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.print(mainList);
    }
}
