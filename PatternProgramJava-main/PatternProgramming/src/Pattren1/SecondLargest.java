package Pattren1;

public class SecondLargest {
    public static void main(String args[]) {

        int[] arr = {10, 12, 56, 89, 88};
        int temp;

        // Bubble sort to sort the array in descending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("second largest:" + arr[1]);


//                // Printing the second-largest element
//               if (arr.length >= 2) {
//                   System.out.println("Second Largest Element: " + arr[1]);
//                } else {
//                   System.out.println("Array doesn't have a second-largest element.");
//               }     }
    }
}



