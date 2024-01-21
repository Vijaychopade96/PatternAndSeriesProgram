package Pattren1;

import java.util.Scanner;

public class PrimeNo {
        public static void main(String[] args){
            Scanner sc1=new Scanner(System.in);
            System.out.println("Enter a Number");
            int no=sc1.nextInt();
            int temp=0;

            for(int i=2;i<=no-1;i++){
                if(no%i==0){
                    temp=temp+1;
                }
            }
            if(temp==0){
                System.out.println(no+":prime number");
            }
            else{
                System.out.println(no+":not a prime number");
            }
        }
}
