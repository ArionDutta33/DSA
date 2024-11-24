package arrays;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        //input
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //output
        System.out.println("Printing the elements");
        for(int i=0;i<arr.length;i++){
             
            System.out.println(arr[i]);
        }
    }
}
