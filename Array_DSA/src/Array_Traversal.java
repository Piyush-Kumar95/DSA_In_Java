public class Array_Traversal {
    public static void main(String[] args) {

        int [] array = {10,20,30,40,50,60,70,80,90,100};

        System.out.println("Array Traversal in for loop");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }


        System.out.println("\nArray Traversal in for each loop");
        for(int a : array){
            System.out.print(a+" ");
        }
    }
}
