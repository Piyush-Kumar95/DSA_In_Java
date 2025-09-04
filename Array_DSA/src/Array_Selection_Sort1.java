public class Array_Selection_Sort1 {
    public static void main(String[] args) {


        // Use for String Value

        String[] array = {"Piyush", "Raju", "Ankit", "Manish", "Nirbhay", "Manu", "Sahil", "Ankur"};

        System.out.println("Original Array ");

        for (String a: array){
            System.out.print(a+" ");
        }

        System.out.println("\nAfter Selection Sort In Array");
        for (int i = 0; i<array.length;i++){

            int min = i;
            for (int j = i+1;j<array.length;j++){

                if (array[min].compareTo(array[j]) > 0 ){
                    min = j;
                }

            }
            String temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        for (String a: array){
            System.out.print(a+" ");
        }
    }
}
