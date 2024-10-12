/*Simple Program for Bill generation of Cafe CRCE */

import java.util.*;
public class CRCE_Cafe {
    public static void main(String[] args) {
        System.out.println("Welcome to Cafe CRCE");
        int coffee_number=0, latte_number=0, expresso_number=0, tea_number=0;
        int coffee_price=0, latte_price=0, expresso_price=0, tea_price=0;
        try(Scanner  numin=new Scanner(System.in);){
        //int item_number=numin.nextInt();
        for(int i=0;i<10;i++){
        System.out.println("\n\nPlace your Order\n\tMenu");
        System.out.println("\nItem Name\t\tPrice (in Rupees)");
        System.out.println("1. Coffee         \t100");
        System.out.println("2. Latte          \t220");
        System.out.println("3. Expresso       \t250");
        System.out.println("4. Tea            \t300");
        System.out.println("\n5. Show Items in Cart");
        System.out.print("---------------------------------");
        System.out.print("\nSelect an Item: ");
        int item_number=numin.nextInt();
        
        switch (item_number) {
            case 1:
                System.out.print("Enter the Quantity: ");
                coffee_number = numin.nextInt();
                coffee_price = coffee_number*100;
                break;
            case 2:
                System.out.print("Enter the Quantity: ");
                latte_number = numin.nextInt();
                latte_price = latte_number*220;
                break;
            case 3:
                System.out.print("Enter the Quantity: ");
                expresso_number = numin.nextInt();
                expresso_price = expresso_number*250;
                break;
            case 4:
                System.out.print("Enter the Quantity: ");
                tea_number = numin.nextInt();
                tea_price = tea_number*300;
                break;
            case 5:
                System.out.print("---------------------------------");
                System.out.println("Items in Cart");
                System.out.println(coffee_number+ " x Coffee         \t"+coffee_price);
                System.out.println(latte_number+ " x Latte          \t"+latte_price);
                System.out.println(expresso_number+ " x Expresso       \t"+expresso_price);
                System.out.println(tea_number+ " x Tea       \t"+tea_price);
                break;
                
            default:
            System.out.println("Invalid INPUT!!");
                break;
        }
        System.out.println("Do you want to order more items? (Y/N)");
        char choice = numin.next().charAt(0);
        if(choice=='N' || choice=='n'){
            break;
        }}
        
        int sub_total = coffee_price + latte_price + expresso_price + tea_price;
    //Bill Generation
        double SGST = sub_total*0.09;
        double CGST = sub_total*0.09;
        System.out.print("---------------------------------");
        System.out.println("\n\tBILL");

        System.out.println("Item Name\tPrice (in Rupees)");
        if(coffee_number!=0){
        System.out.println(coffee_number+ " x Coffee         \t"+coffee_price);
        }
        if(latte_number!=0){
        System.out.println(latte_number+ " x Latte          \t"+latte_price);
        }
        if(expresso_number!=0){
        System.out.println(expresso_number+ " x Expresso       \t"+expresso_price);
        }
        if(tea_number!=0){
        System.out.println(tea_number+ " x Tea       \t"+tea_price);
        }
        System.out.println("\nSub Total  \t"+sub_total);
        System.out.println("SGST       \t"+SGST);
        System.out.println("CGST       \t"+CGST);
        System.out.println("Total GST  \t"+(SGST+CGST));
        double grand_total= sub_total+SGST+CGST;
        System.out.println("\nGrand Total:\t"+grand_total);
        System.out.println("---------------------------------");
    }}
}
