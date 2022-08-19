import java.util.*;
public class PreWorkAssignmentByAbhinav {

    //function to checkPalindrome

    public void checkPalindrome()  {
        // Objects of String class
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");

        System.out.println("\nThis Code is Prepared by - 'Er. Abhinav Raj' \nThanks & Regards\nAbhinav Raj.");
    }



    //function to printPattern

    public void printPattern() {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Please enter the number of rows you want to Print as a star ");
        n = in.nextInt();
        System.out.println("Here we go....!");
        //Outer Loop (Rows)
        for (int i=n; i>=1; i--){
            //Inner Loop(Column)
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nThis Code is Prepared by - 'Er. Abhinav Raj' \nThanks & Regards\nAbhinav Raj.");
    }
    //function to check no is prime or not

    public void checkPrimeNumber() {
        Scanner in = new Scanner(System.in);
        int num, flag=0, i, m=0;
        System.out.println("Enter a number to check weather it is prime or not");
        num = in.nextInt();
        m=num/2;
        /**
         * The numbers which are only divisible by 1 & themselves are called prime numbers.
         * (Or)
         * The numbers which have factors 1 and themselves are called prime numbers.
         *  ------------------------------------------------------------------------------
         * eg - Example_1: If the input number is 23
         * Factors of 23 are 1, 23, and other than 1 it  is divisible by 23 only
         * Hence the number is prime.
         *
         * Example_2: If the input number is 22
         * Factors of 22 are 1,2, 11, 22 and are divisible by 2 and 11.
         * Hence the number is not a prime number.*/

        if(num==0||num==1){
            System.out.println(num+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(num%i==0){
                    System.out.println(num+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(num+" is prime number"); }
        }
        System.out.println("\nThis Code is Prepared by - 'Er. Abhinav Raj' \nThanks & Regards\nAbhinav Raj.");
    }
    // function to print Fibonacci Series
    public void printFibonacciSeries() {

        int n1=0, n2=1, n3=0, Count, i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number to see their Fibonacci series on console");
        Count = in.nextInt();
        System.out.println("Here We go....!");
        //Printing 0 and 1
        System.out.print(n1+" "+n2);
        for (i=2;i<Count;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
        System.out.println("\nThis Code is Prepared by - 'Er. Abhinav Raj' \nThanks & Regards\nAbhinav Raj.");
    }
//main method which contains switch and do while loop

    public static void main(String[] args) {
        PreWorkAssignmentByAbhinav obj = new PreWorkAssignmentByAbhinav();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nEnter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    choice = 0;
                    break;
                case 1: {
                    obj.checkPalindrome();
                }
                break;
                case 2: {
                    obj.printPattern();
                }
                break;
                case 3: {
                    obj.checkPrimeNumber();
                }
                break;
                case 4: {
                    obj.printFibonacciSeries();
                }
                break;
                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");
            }

        } while (choice != 0);
        System.out.println("Exited Successfully!!!");
        System.out.println("\nThis Code is Prepared by - 'Er. Abhinav Raj' \nThanks & Regards\nAbhinav Raj.");
        sc.close();

    }
}
