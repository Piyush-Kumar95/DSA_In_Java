public class Array_Bubble_Sort {
    public static void main(String[] args) {

        int [] array = {12,85,47,65,2,9,35,15};

        System.out.println("Original Array ");

        for (int a : array){
            System.out.print(a+" ");
        }

        // Bubble Sort

        int lenght = array.length-1;
        int temp;

        System.out.println("\nAfter Bubble Sort in Array ");

        for (int i = 0; i<lenght;i++){

            boolean sorted = false;

            for (int j = 0; j<lenght-i;j++){

                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    sorted = true;
                }
            }
            if (sorted == false){
                break;
            }
        }
        for (int a: array){
            System.out.print(a+" ");
        }
    }
}
