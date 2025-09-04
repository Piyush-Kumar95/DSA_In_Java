public class Array_Linear_Search {
    public static void main(String[] args) {

        int [] array = {10,20,30,40,50,45,75,84,65,98};
        System.out.println("Original Array");

        for (int a : array){
            System.out.print(a+" ");
        }

        // Search Element

        int element = 50;
        boolean search = false;
        for (int i =0;i<array.length;i++){

            if (array[i] == element){
                System.out.println("\nElement at "+i+" Index Position");
                search = true;
                break;
            }
        }
        if (!search){
            System.out.println("\nElement Not Found ");
        }
    }
}
