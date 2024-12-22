/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;
class bankaccount{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount(in integers) u have:");
        int amount = scan.nextInt();
        System.out.println("Enter the choices of bank entry:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Remaining balance");
        System.out.println("4. Exit\n");
        int choice;
            do{
                System.out.print("Enter your choice:");
                choice = scan.nextInt();
                switch(choice){
                    case 1:
                        System.out.print("Enter the money needed to deposit:");
                        int depo = scan.nextInt();
                        amount += depo;
                        System.out.println("Amount after depositing:" + amount);
                        break;
                    case 2:
                        System.out.println("Enter the money needed to withdraw:");
                        int withdraw = scan.nextInt();
                        if(withdraw > amount){
                            System.out.println("Insufficient Balance.");
                        }
                        amount -= withdraw;
                        System.out.println("Amount after withdrawal: " + amount);
                        break;
                    case 3:
                        System.out.println("Remaining balance: " + amount);
                        break;
                    case 4:
                        System.out.println("The end!!!");
                    break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
            }
        }while(choice != 4);
    }
}