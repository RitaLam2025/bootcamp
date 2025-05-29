public class Student {
  private static int counter = 0;
  private int id;
  private Candy[] candies;

  public Student() {
    this.id = ++counter;
    this.candies = new Candy[0];
  }

  public void receive(Candy candy) {
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i = 0; i < this.candies.length; i++) {
      newCandies[i] = this.candies[i];
    }
    
  }
}
