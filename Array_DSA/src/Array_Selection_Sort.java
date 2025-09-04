public class Array_Selection_Sort {
    public static void main(String[] args) {

        // Use by Integer Values

        int [] array = {45,68,61,24,85,42,31,21,45};
        System.out.println("Original Array");
        for (int a: array){
            System.out.print(a+" ");
        }

        System.out.println("\nAfter Selection Sort In Array ");
        for (int i = 0; i<array.length;i++){

            int min = i;
            for (int j = i+1;j<array.length;j++) {

                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        for (int a : array){
            System.out.print(a+" ");
        }

    }
}
