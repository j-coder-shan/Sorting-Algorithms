public class Insertion_Sort {
    public void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = i;

            while(j > 0){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                j--;
            }
        }
        for(int item : arr){
            System.out.print(STR."\{item} ");
        }
    }
}
