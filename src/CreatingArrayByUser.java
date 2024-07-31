import java.util.Scanner;
import java.util.Arrays;

public class CreatingArrayByUser{
    public static void main(String[] args) {
        System.out.println("Enter number of items: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        int[] items = new int[index];

        System.out.println("Now enter " + index + " values:");
        for(int i = 0; i < index; i++){
//            int item = sc.nextInt();
            items[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(items));
    }
}