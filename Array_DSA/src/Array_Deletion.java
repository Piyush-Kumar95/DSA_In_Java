public class Array_Deletion {
    public static void main(String[] args) {

        int [] array = {10,20,30,40,50,60};
        System.out.println("Original Array");
        for (int a : array){
            System.out.print(a+" ");
        }

       // Delete Element

        int index = 4;

        System.out.println("\nAfter Delete Element in Array ");

        int [] newArray = new int[array.length -1];
        int j = 0;
        for (int i = 0; i<array.length;i++){
            if (index == i){
                continue;
            }
            newArray[j] = array[i];
            j++;
        }
        for (int a : newArray){
            System.out.print(a+" ");
        }
    }
}
