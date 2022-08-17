package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        //task1;
        //Ask user to input two numbers, compare them and output result:
        // Input:
        // Enter value a: 10
        // Enter value b: 10
        int vala = 10, valb = 10;
        System.out.println ("Value a equals  Value b = " + (vala == valb));//true

        // is 10 less than 10? - false
        System.out.println (10 < 10);//false

        // is 10 less or equal to 10? - true
        System.out.println (10 <= 10);//true

        //  is 10 greater or equal to 10? - true
        System.out.println (10 >= 10);//true

        // is 10 greater than 10? - false
        System.out.println (10 < 10);//false

        // is 10 equal to 10? - true
        System.out.println (10 == 10);//true
        {
            //task2()
            //Ask user to input two boolean values and compare them.
            //       Input:
            // Enter b1: true
            //Enter b2: false
            // Expected output:
            // Is b1 and b2 equal? - false

            System.out.println ("enter b1 : ");
            int b1 = scanner.nextInt ();
            System.out.println ("enter b2 : ");
            int b2 = scanner.nextInt ();

            //System.out.println (b1 == b2);//false
            if (b1 == b2) {
                System.out.println ("numbers are equal" + false);
            } else {
                System.out.println ("numbers are not equal");
            }
            {
                //task 3
                // Declaring and initializing integer variable
                // Ask user to input a whole number and output true, if it is even number and false if it is odd number
                //  Hint: use remainder operator to divide number by two and get reminder (if reminder is 0 then it means it is even number)-
                System.out.println ("enter number : ");
                int num = scanner.nextInt ();
                // Checking if number is even or odd number
                // via remainder
                if (num % 2 == 0) {
                    // If remainder is zero then this number is even
                    System.out.println ("Entered Number is Even" + false);
                } else {
                    // If remainder is not zero then this number is
                    // odd
                    System.out.println ("Entered Number is Odd" + true);
                }
                //   4) Ask user to input a whole number and output false, if it is even number and true if it is odd number
                System.out.println ("enter number : ");
                int num1 = scanner.nextInt ();
                // Checking if number is even or odd number
                // via remainder
                if (num1 % 2 == 0) {
                    // If remainder is zero then this number is even
                    System.out.println ("Entered Number is Even" + true);
                } else {
                    // If remainder is not zero then this number is
                    // odd
                    System.out.println ("Entered Number is Odd" + false);
                    {
                        //Task 5
                        // Write a program which reads boolean value from user and prints out the opposite value:
                        // Example input:
                        // Enter boolean value: true
                        // Expected output:
                        //  Opposite of "true" is "false"

                        boolean value;

                        System.out.println ("Enter boolean value: ");
                        value = scanner.nextBoolean ();
                        scanner.close ();

                        System.out.println (!value);


                        {
                            //task 6
                            // Write a program which asks the user to input two whole numbers a and b. Output "true", if one of this condition is true:
                            // 1) a and b is equal
                            // 2) a is less than 0 and b is greater than 0
                            //  3) both of them are greater than 100
                            // otherwise output "false":
                            // Examples:
                            //  a is -1 and b is -2 -> false
                            //  a is -2 and b is 1 -> true
                            //  a is -1 and b is -1 -> true
                            //  a is 101 and b is 102 -> true
                            //  a is 99 and b is 200 -> false
                            int a, b;

                            System.out.println("Enter value of a: ");
                            a = scanner.nextInt();
                            System.out.println("Enter value of b: ");
                            b = scanner.nextInt();
                            scanner.close();

                            System.out.println((a==b)||((a<0)&&(b>0))||((a>100)&&(b>100)));

                        }
                    }
                }
            }
        }
    }

}
