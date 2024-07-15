public class test {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 1, 4, 9, 2, 3, 6, 8 };

        System.out.print("\nUnsorted array: ");
        for(int item : arr){
            System.out.print(STR."\{item} ");
        }

        Insertion_Sort insertionSort = new Insertion_Sort();
        System.out.print("\nSorted array: ");
        insertionSort.sort(arr);


    }
}
