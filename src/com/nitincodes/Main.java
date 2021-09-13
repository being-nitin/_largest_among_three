package com.nitincodes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// java program to find the largest among three:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: a");
        int a = sc.nextInt();
        System.out.println("Enter the second number: b");
        int b = sc.nextInt();
        System.out.println("Enter the third number: c");
        int c = sc.nextInt();
        if(a>c) {
            if (a > b) {
                System.out.println(+a + " is the greatest");
            } else {
                System.out.println(+b + " is the greatest");
            }
        }else{
            if (b>c){
                System.out.println(+b+"is the greatest");
            }else{
                System.out.println(+c+" is the greatest");
            }
        }
    }
}
