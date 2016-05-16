/*
 * products can be stored in a bag too
 * only 3 bags are allowed, handled by bagId
 */
abstract class Bag extends Cart
{
/*
 * if bag is required by customer and number
 * of bags used by customer is less than 3,
 * items can be stored in a bag using addBag()
 */
 public void addBag(int id, int qty)
 {
  bagId++;                                     // for every addBag, user wants to add a bag
  if (bagId > 3)
  System.out.println("you cannot take more than 3 bags.Sorry!!");
  else
  addCart(id, qty);                            // transfer the contents to cart
 }
}