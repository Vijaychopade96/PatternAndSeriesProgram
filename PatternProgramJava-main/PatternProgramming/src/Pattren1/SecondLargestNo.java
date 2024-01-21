package Pattren1;

public class SecondLargestNo {
    public static void main(String[] args) {

        int [] arr={10,12,56,89,88};
        int temp;

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++)
            {

                if(arr[i]<arr[j]){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
            System.out.println(arr[1]);
        }
    }
}
