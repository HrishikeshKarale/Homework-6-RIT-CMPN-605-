/**
* Store.java
*
* @version   $Id: Store.java,v_1.0 2014/10/06 21:20:00
*
* @author    ap8185 (Atir Petkar)
* @author    hhk9433 (Hrishikesh Karale)
*
*
* Revisions:
*      Initial revision
*/

import java.util.Scanner;


public class Store extends Cashier
{
 public static void main(String args[]) throws Exception
 {
  Customer C = new Cashier();
  String yn="";                                   //to store the response of user as 'y' or 'n'      
  int id;                                         //item id of the product
  int qty;                                        //quantity required of the product
  Scanner sc = new Scanner(System.in);
  System.out.println("Your name");
  C.name = sc.next();
  for (int i = 0 ; i < 100 ; i++)
  {
   System.out.println("item id	  Product   Price");
   for (int j = 0 ; j < itemId.length ; j++)
    System.out.println("   " + itemId[j] + "      " 
                       + item[j] + "     " + itemPrice[j]);
   System.out.println("Please add the item id u want in cart!");
   
   id = sc.nextInt();
   System.out.println("quantity :");
   qty = sc.nextInt();
   if (C.bagId < 3)                               //if numbers of bags is less than 3, then ask for bag
   {	
    System.out.println("Do you want it in bag?(y/n)");
    yn = sc.next();
    if (yn.equals("y"))
     C.addBag(id, qty);                          //if 'y' then add in bag
    else
     C.addCart(id, qty);                         // if 'n' then add in cart
   }
   else
   C.addCart(id, qty);                           // if number of bags > 3 , add directly in cart
   System.out.println("Do u want to continue?(y/n)");
   yn = sc.next(); 
   if (yn.equals("n"))
    break;                                       
   else
    continue;
  }
  sc.close();
  C.getReceipt();                                //show the details of the products purchased
  C.totalAmount();                               //display the amount to be paid, no of carts and bag used
 }
}
