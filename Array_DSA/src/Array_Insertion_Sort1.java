public class Array_Insertion_Sort1 {
    public static void main(String[] args) {

        // Use for String Value

        String [] array = {"Manu","Raju","Ankit","Ram","Piyush","Manu"};

        System.out.println("Original Array");
        for (String a : array){
            System.out.print(a+" ");
        }

        System.out.println("\nAfter Insertion Sort In Array");

        for (int i = 1;i<array.length;i++){

            String temp = array[i];
            int j  = i -1;

            while (j >= 0 && array[j].compareTo(temp) > 0){

                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;

        }

        for (String a :array){
            System.out.print(a+" ");
        }

        }
    }

