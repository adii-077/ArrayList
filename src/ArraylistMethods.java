import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistMethods {
    public static void main(String[] args) {

        ArrayList<Integer> myArraylist = new ArrayList<>();

        myArraylist.add(1);
        myArraylist.add(2);
        myArraylist.add(3);
        myArraylist.add(4);
        myArraylist.add(5);
        myArraylist.add(6);
        myArraylist.add(7);
        myArraylist.add(8);
        myArraylist.add(9);
        myArraylist.add(10);

        for (Integer i : myArraylist) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

//        myArraylist.set(9, 290);
//        for (Integer i : myArraylist) {
//            System.out.print(i + " ");
//        }

//        int a = myArraylist.get(0);
//        System.out.println(a);

//        myArraylist.add(990);
//        for (Integer i : myArraylist) {
//            System.out.print(i + " ");
//        }

//        myArraylist.remove(9);
//        for (Integer i : myArraylist) {
//            System.out.print(i + " ");
//        }

//        myArraylist.clear();
//        for (Integer i : myArraylist) {
//            System.out.print(i + " ");
//        }

//        int n = myArraylist.size();
//        System.out.println(n);

//        myArraylist.add(1);

//        myArraylist.add(5);
//        myArraylist.add(1);
//        myArraylist.add(2);
//        myArraylist.add(9);
//        myArraylist.add(6);
//        myArraylist.add(8);
//        myArraylist.add(7);
//        System.out.println(myArraylist);

//        Collections.sort(myArraylist);
//        System.out.println("ordered list: "+ myArraylist);

//        Collections.shuffle(myArraylist);
//        System.out.println("shuffled list: "+ myArraylist);

//        ArrayList<Integer> clonedList1 = (ArrayList<Integer>) myArraylist.clone();
//        System.out.println(clonedList1);
//        Collections.shuffle(clonedList1);
//        System.out.println(clonedList1);

        boolean check = myArraylist.contains(5);
        System.out.println(check);
//                  OR
        System.out.println(myArraylist.contains(9));


    }
}
