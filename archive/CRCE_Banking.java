/*Write a code for a banking app with class account, functions deposit, withdraw, & check balanace */

import java.util.*;

class account
{
    float balance=0;
    float deposit(float amount)
    {
        balance+=amount;
        return balance;
    }
    float withdraw(float amount)
    {
        if(balance<(balance-amount))
        {
            System.out.println("\nInsufficient balance!!! Transaction Failed!\n");
            return balance;
        }
        else
        {
            balance-=amount;
            return balance;
        }
    }
    float check_balance()
    {
        return balance;
    }
    
}

public class CRCE_Banking {
    
    public static void main(String[] args) {
        account user = new account();
        try (Scanner sc = new Scanner(System.in)) {
            int choice,flag=0;
            float amount;
            System.out.println("\nWelcome to CRCE Bank");

            while(flag==0)
            {
                System.out.println("\nSelect an Option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.println("Enter your choice:");
                choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.println("Enter the amount to deposit:");
                        amount = sc.nextFloat();
                        System.out.println("\nBalance after deposit: "+user.deposit(amount));
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdraw:");
                        amount = sc.nextFloat();
                        System.out.println("Balance after withdrawal: "+user.withdraw(amount));
                        break;
                    case 3:
                        System.out.println("\nBalance: "+user.check_balance());
                        break;
                    case 4:
                        flag=1;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }
    
}
