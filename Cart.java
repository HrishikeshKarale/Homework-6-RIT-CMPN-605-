/*
 * Cart consist of addCart method
 * which adds the product purchased
 * in the cart
 * for products more than 50, cartId 
 * becomes 2 which means 2nd cart is added
 */
abstract class Cart extends Item
{     
/*
 * addCart method basically adds the new products in
 * customers cart. if the number of elements are greater than 50
 * , a new cart with cartId = 2 is given to customer
 * Total no of items allowed per customer is 100
 */
 public void addCart(int id, int qty)
 {  
  	
  for (int i = 0 ; i < custItems.length  ; i++)
  {
   if (itemId[i] == id)                  // find the itemId of the product
   {
    no_of_items +=qty;                   /* for the product found add the quantity required 
                                           to number of items purchased already by customer*/ 
    if (no_of_items > 100)               // no_of_items > 100 not allowed
    {
	 no_of_items -= qty;
     System.out.println("you have exceeded the limit of 100 products, please reduce the quantity if you want to continue");	
    }
    else
     if (no_of_items > 50)                // no_of_items > 50 --> give a new cart to customer
     {
      cartId = 2;   	
      custItems[i] = item[i];
      item_qty[i] += qty; 
     }
     else
     {
      cartId = 1;
      custItems[i] = item[i];
      item_qty[i] += qty; 
     }
   }
  }
 }
}
