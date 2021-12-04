package com.returnNextEvenValue;

import java.util.Scanner;

public class MainReturnClass {
    public static void main(String[] args) {

        // Lambda Expression to Return next even value.
        ReturnValueInterface lambda= l-> (l%2!=0) ? l+1:l+2 ;
        Scanner scanner = new Scanner(System.in);

        // Enter Input to perform above Lambda Function
        System.out.println("\n Enter any integer value :");
        long n = (long) Double.parseDouble(scanner.next());

        // result show :
        System.out.println("\n Next Even Number of entered Value is :");
        System.out.println(lambda.nextEven(n));
    }
}
