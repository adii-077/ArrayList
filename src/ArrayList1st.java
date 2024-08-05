import java.util.ArrayList;

public class ArrayList1st {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(19); //19 is value
        myArrayList.add(25); //25 is value
        myArrayList.add(33); //33 is value
        myArrayList.add(0, 19); //0 is index, 19 is element
        myArrayList.add(3, 51);

        myArrayList.set(0, 12);

        myArrayList.remove(2); //2 is index

        for (Integer i : myArrayList) {
            System.out.println(i);
        }
    }
}

// WAP to ask user 10 no and store even and odd numbers in different arraylist
//
// create documentation report of different arraylist methods: It should include (10)
//method name
//syntax
//explanation
//example
//
//WAP to create result generator store marks in arraylist