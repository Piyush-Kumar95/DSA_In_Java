import java.util.Scanner;

public class Array_Sum {
    public static void main(String[] args) {

        int [] array;
        array = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter Array Element : ");
        for (int i = 0;i<array.length;i++){

            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i =0;i<array.length;i++){
            sum = array[i] + sum;
        }

        System.out.println("Sum of 5 Element in Array - "+sum);
    }
}
