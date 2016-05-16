/*
 * abstract Base class Customer 
 * consisting of all the required fields and methods 
 * required by the store for transactions carried out by a 
 * customer in their store
 * 
 */
abstract class Customer
{
 String name;                              // name of the customer
 String custItems[] = new String[5];       //array to store items bought by customer
 int no_of_items;                          //total no of items
 int item_qty[] = new int[5];              //quantity of each item
 double itemPrice[];                       // price of each item is stored in this array
 int itemId[] = new int[5];                //itemId of each product is stored
 int cartId = 0;                           //id for cart, cartId = 2 when no_of_items > 50 
 int bagId = 0;                            //id for bag, only max 3 bags are allowed
 public abstract void totalAmount();
 public abstract void getReceipt();
 public abstract void addCart(int id, int qty);
 public abstract void addBag(int id, int qty);
}