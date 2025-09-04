public class Array_Insertion_Sort {
    public static void main(String[] args) {

        // Use for Integer Value

        int [] array = {58,47,98,21,45,12,34,21};

        System.out.println("Original Array");
        for (int a : array){
            System.out.print(a+" ");
        }

        System.out.println("\nAfter Insertion Sort In Array");
        for (int i = 1;i<array.length;i++){

            int temp = array[i];
            int j = i-1;

            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;

            }
               array[j+1] = temp;
            }

        for (int a :array){
            System.out.print(a+" ");
        }

        }
    }

