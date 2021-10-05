package com.company;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:- ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<num; i++){
            if (num%i == 0){
                sum = sum + i;
                System.out.println("Factors: " + i );
            }
        }
        int a = sum;
        System.out.println(a);
        if (num == a){
            System.out.println(num + " Is a Perfect Number");
        }
        else{
            System.out.println(num + " Is not a Perfect Number");
        }



    }
}
