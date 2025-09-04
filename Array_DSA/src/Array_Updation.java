public class Array_Updation {
    public static void main(String[] args) {

        int [] array = {10,20,30,40,50,45,75,84,65,98};
        System.out.println("Original Array");
        for (int a : array){
            System.out.print(a+" ");
        }

        // Update Element

        int index = 4;
        int element = 454;

        System.out.println("\n After Update Element in Array");
        array[index] = element;

        for (int a : array){
            System.out.print(a+" ");
        }

    }
}
