public class Array_Binary_Search {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
        System.out.println("Original Array ");
        for (int a : array) {
            System.out.print(a + " ");
        }

        // Binary Search

        int element = 100;
        int li = 0;
        int hi = array.length - 1;

        boolean search = false;

            while (li <= hi) {

                int mid = (li + hi) / 2;

                if (array[mid] == element) {
                    System.out.println("\nElement at " + mid + " Index Position");
                    search = true;
                    break;
                }
                if (element > array[mid]) {
                    li = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        if (!search) {
            System.out.println("\nElement Not Found");
        }
    }
}
