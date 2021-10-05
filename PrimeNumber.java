package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number:- ");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean prime = true;
        for (int i = 2; i < input; i++){
            if (input%i == 0){
                prime = false;
                break;
            }
        }
        if (prime){
            System.out.println(input + " Is A Prime Number");
        }
        else {
            System.out.println(input + " Is Not A Prime Number");
        }
    }
}
