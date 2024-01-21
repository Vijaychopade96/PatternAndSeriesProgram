package Pattren1;

public class duplicateFind {


    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 6,  8, 7, 2, 9,};
      for (Integer i:arr){
          System.out.println(i);
      }
        System.out.println("=====================");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Number:" + arr[j]);
                }
            }
        }
    }
}

