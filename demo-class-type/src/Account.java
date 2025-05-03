public class Account {
  //Attributes // only a 死物模型）唔一定係ACCOUNT
  private String userId;
  private double balance;// default as 0.0


  // ! can be more than 1 constructors
  //constructor 
  public Account () { //empty constructor (no parameter)
    // ! empty constructor implicitly exists (when there is no constructor)
    this.balance = 10.0;
  }

  // All arguments constructor (All parameters)
  public Account(String userId, double balance) {
    this.userId = userId;
    this.balance = balance;
  }

// ! write (Method)
  public void setbalance(double balance) {
    this.balance = balance; // as has set the answer to it, so nothing to return, as between public and method name cant be empty, so put void
  }

// !read
  public double getBalance() {
    return this.balance;
  }

  public static void main(String[] args) {
    Account [] accounts = new Account[3]; // create Account array 
    Account a1 = new Account();
    Account a2 = new Account();
    a2.setbalance(800.0);
    Account a3 = new Account();
    accounts [0] = a1;
    accounts [1] = a2;
    accounts [2] = a3; // total 4 arrays put the account into it , then sin sysout

    System.out.println(accounts[1].getBalance());
    System.out.println(accounts[0].getBalance()); // !! why not 0.0/

    String [] names = new String[]
  }
  





  public static void main(String[] args) {
    // object reference: a1, a2
    //"new" --> create an object of Account 
    Account a1 = new Account();
    a1.setbalance(100.0);
    System.out.println(a1.getBalance());

    Account a2 = new Account();
    a2.setbalance(200.0);
    System.out.println(a2.getBalance());

    a1 = a2;
    a2.setbalance(500.0);
    System.out.println(a1.getBalance());
    System.out.println(a2.getBalance());
    // a1 gei address copy to a2 gei address, so original a2 address deleted, a1 and a2 point to the same object, so change the answer to 500 , then both a1, a2 is 500.
    // a1.setbalance--> a1 self (. =) goes to setbalance (this mode)



  }
}
