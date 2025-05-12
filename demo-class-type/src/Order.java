public class Order {
  // checkoutAmount
  private double [] prices; //99, 14, 150
  private int[] quantities; // 2,3

  //Alternative
  private Item[] items; // can out things inside
  //物件陣容有沒有變化。//

  public Order() {
    this.items = new Item[0] ;
  }
// difficult but can understand more later//
  public void add(Item newitem) { // prepare for itself
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      newItems[i] = items[i];
    }
    newItems[newItems.length - 1] = newItem;
    this.items = newItems;
  }

  //BigDecimal
  // ! Item.java owns price & quantity (attribute), so item has to present price & quantity.
  public double checkoutAmount(String coupon) {
    double total = 0.0;
    for (int i = 0; i < this.items.length; i++) {
      total += this.items[i].subtotal();
    }
    return total;
  }

  public static void main(String[] args) {
    Order order = new Order(); // array length = 0 

    Item itemA = new Item(99,2);
    order.add(itemA); //array length = 1

    Item itemB = new Item(14, 3);
    order.add(itemB); // array lengtj = 2

    System.out.println(order.checkoutAmount()); //240.0
  }




}
