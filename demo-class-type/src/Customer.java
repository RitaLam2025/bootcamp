// customer has many orders
public class Customer {
  private long id; // id use long
  private String name;
  private Order[] orders; // use customer to get the orders

  public Customer() {
    this.orders = new Order[0]; //array object
  }

  public String getName() {
    return this.name;
  }

  public long getId() {
    return this.id;
  }

  // !! recite// 
  public void add(Order newOrder) {
    Order[] newOrders = new Order[this.orders.length +1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    newOrders[newOrders.length - 1] = newOrder;
    this.orders = newOrders;
  
  }

  //main()
  // John --> many orders --> items

  // isVIP();
  // total amont of orders > 100,000 

  //bigdecimal
  public boolean isVIP() {
    double total = 0.0;
    for (int i = 0; i < this.orders.length; i++) {
      total += this.orders[i].checkoutAmount();
    }
    //if (total > 100_000) {
    // return true;
    // }
    // return false;
    return total > 100_000;
  }

  public static void main(String[] args) {
    Customer c1 = new Customer (); // "new" --> calling, "customer ()" constructor
    c1.add(new Order())
    System.out.println(c1.isVIP()); // true/ false

  }
}
