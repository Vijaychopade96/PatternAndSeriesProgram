package Pattren1;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15};

        int secondLargest = findSecondLargest(numbers);

        System.out.println("The second largest number is: " + secondLargest);
    }

    static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return -1; // or throw an exception
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
