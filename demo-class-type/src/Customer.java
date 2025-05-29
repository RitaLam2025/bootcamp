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

// !! recite //
public void add(Order newOrder) {
  Order[] newOrders = new Order[this.orders.length +1];
  for (int i = 0; i < this.orders.length; i++)
}
  public boolean add(Order newOrder) {
    Order [] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders [i] = this.orders[i];
    }
    newOrders[newOrders.length - 1] = newOrder;
    this.orders = newOrders;
    return true;
  }

  // !! recite// if no "return type", then put void,
  public void add(Order newOrder(itemA)) {
    Order[] newOrders = new Order[this.orders.length +1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    newOrders[newOrders.length - 1] = newOrder;
    this.orders = newOrders;
  
  }

  //main()
  // John --> many orders --> items

  public void setName(String name) {
    this.name = name;
  }

  // isVIP();
  // total amont of orders > 100,000 

  //bigdecimal
  public boolean isVIP() {
    double total = 0.0;
    for (int i = 0; i < this.orders.length; i++) {
      total += this.orders[i].checkoutAmount(); // 指明去到個隻 ORDER
    }
    //if (total > 100_000) {
    // return true;
    // }
    // return false;
    return total > 100_000; // standard true, false 
  }

  // check the extreme case - eg, order is 0, 

  public static void main(String[] args) {
    Customer c1 = new Customer (); // "new" --> calling, "customer ()" constructor, line 7 
    c1.setName("John");

    Item itemA = new Item(10.9, 2);
    Item itemB = new Item(99.9, 3);
    Order orderA = new Order(itemA);
    orderA.add(itemB);
    c1.add(orderA);
    System.out.println("Customer" + c1.getName() + ", VIP status");


    c1.add(new Order(itemA));

    System.out.println(c1.isVIP()); // true/ false
  }

}
