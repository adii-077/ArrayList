import java.util.Scanner;
import java.util.ArrayList;

public class EvenOdd {
    public static void main(String[] args) {

        System.out.println("Enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();

        ArrayList<Integer> evenArray = new ArrayList<>();
        ArrayList<Integer> oddArray = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
                if (number % 2 == 0) {
                    evenArray.add(number);
                } else {
                    oddArray.add(number);
                }
        }

        for (Integer i : evenArray) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (Integer i : oddArray) {
            System.out.print(i + " ");
        }

    }
}
