public class Array_Insertion {
    public static void main(String[] args) {

        int [] array = {11,14,45,65,85,69,74,85};

        System.out.println("Original Array");
        for (int a : array){
            System.out.print(a+" ");
        }

        // Insert Element
        int index = 5;
        int element = 94;

        System.out.println("\nAfter Insert Element In Array ");

        int [] newArray = new int[array.length + 1];

        for (int i = 0; i<index;i++){
            newArray[i] = array[i];
        }

        newArray[index] = element;

        for (int i = index;i<array.length;i++){

            newArray[i+1] = array[i];
        }

        for (int a: newArray){
            System.out.print(a+" ");
        }
    }
}
