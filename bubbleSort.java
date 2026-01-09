
//bubble sorting
public class bubbleSort {

    public static void main(String args[]) {
        // declaring the unarranged arry over here
        int arr[] = {5, 6, 7, 2, 4, 9};
        
        //running array 1 time less than array lenth because last one is automatically arranged.
        for (int i = 0; i <= arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                /*
                time complexity is n^2
                Swaping the value
                this is foundation for sorting but we will never use this sorting in professinal level
                qustion will be asked about this concept in interview
                */
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);

    }
    //Method to Print the arranged array or let say all array whatever the array.
    public static void printArray(int arr[]){ 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
