    /******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*Write an entire Java program that reads a positive integer entered by an interactive user and then prints
out all the positive divisors of that integer in a column and in decreasing order. The program should allow
the user to repeat this process as many times as the user likes. Initially, the program should inform the
user about how the program will behave. Then the program should prompt the user for each integer that
the user wishes to enter.
The program may be terminated in any of two ways. One way is to have the program halt if the
user enters an integer that is negative or zero. In this case the user should be reminded with each prompt
that the program can be terminated in that way. Alternatively, after an integer has been entered and the
divisors have been printed, the program can ask the user whether he/she wishes to enter another integer.
In this case, when the user accidentally enters a zero or negative integer to have its divisors calculated, the
program should inform the user that the input is unacceptable and should allow the user to try again (and
again!).
Here is an illustration of how the program and the interactive user might interact. The user's
responses to the program are shown in bold italics. 
This program is designed to exhibit the positive divisors of
positive integers supplied by you.  The program will repeatedly
prompt you to enter a positive integer.  Each time you enter a
positive integer, the program will print all the divisors of your
integer in a column and in decreasing order.
Please enter a positive integer: 36
36
18
12
9
6
4
3
2
1
Would you like to see the divisors of another integer (Y/N)? y
Please enter a positive integer: ‐44
‐44 is not a positive integer.
Please enter a positive integer: 0
0 is not a positive integer.
Please enter a positive integer: 109
109
1
Would you like to see the divisors of another integer (Y/N)? m
Please respond with Y (or y) for yes and N (or n) for no.
Would you like to see the divisors of another integer (Y/N)? n*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char response = 'y';
        while(response == 'y'){
            System.out.print("Enter an number:");
            int n = scan.nextInt();
            if(n <= 0){
                System.out.println(n + " is not a positive integer. Retry");
                continue;
            }
            System.out.println("Factors of " + n + " are: ");
            for(int i = 1; i <= n; i++){
                if(n % i == 0){
                    System.out.println(i);
                }
            }
            System.out.print("Do u want to enter any other number(y/n):");
            response = scan.next().charAt(0);
        }
    }
}