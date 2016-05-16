/*
 * products purchased by the customer are displayed by the
 * getReceipt method of Receipt class
 */
abstract class Receipt extends Bag
{
/*
 *  show the name of the customer , items ordered, their quantity and total amount of each item using
 *  getReceipt() method
 */	
 public void getReceipt()
 {
  System.out.println("name : " + name);
  System.out.println("products ordered");
  System.out.println(" item" + "   quantity" + "   Amount");
  for (int i = 0 ; i < custItems.length ; i++)
  {
   if (item_qty[i] != 0)
   System.out.println( custItems[i] + "     " + item_qty[i]
                        + "        " + item_qty[i]*itemPrice[i] + "$");
  }
 }
}
