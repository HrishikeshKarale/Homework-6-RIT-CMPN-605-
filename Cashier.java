/*
 * Cashier finds the total bill of the customer,
 * number of carts used and number of bags used 
 * by the customer
 */
class Cashier extends Receipt
{
 public void totalAmount()
 {
  double total = 0;
  for (int i = 0 ; i < custItems.length ; i++)
  {
   total += item_qty[i] * itemPrice[i];	          //total to be paid is calculated
  }
  System.out.println("total bill : " + total +"$");
  System.out.println("no of carts: " + cartId);   // no of carts used by customer
  System.out.println("no of bags: " + bagId);     // no of bags used by customer
 }
}
