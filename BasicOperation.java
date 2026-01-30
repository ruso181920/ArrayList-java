
import java.util.ArrayList;

public class BasicOperation{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Float>list2=new ArrayList<>();
        ArrayList<String>list3=new ArrayList<>();
        
       // adding element
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(1,9);
       list2.add(4.6f);
         list2.add(4.3f);
       list2.add(123.123f);

        list3.add("raushan");
        list3.add("abhishek");
        list3.add("manish");

        // printing element
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);

        //get element
        // float element=list2.get(2);
        // System.out.println(element);

        // String el=list3.get(2);
        // System.out.println(el);

        // int ele=list.get(2);
        // System.out.println(ele);

        //Remove element
        list.remove(2);
        System.out.println(list);

        //set element at Index

        list.set(1,10);
       System.out.println(list);

       // check element
       System.out.println(list.contains(2));
       System.out.println(list.contains(10));

       //size of arraylist
       System.out.println(list.size());

       // print the arraylist
       for (int i = 0; i <list.size() ; i++) {
           System.out.println(list.get(i));
       }
       System.out.println();
    }

    
}