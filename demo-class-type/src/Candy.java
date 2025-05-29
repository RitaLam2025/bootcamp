public class Candy {
  private static int count = 20;
  private String Color;






  // Candy has color, number 
  //.....
  // 20 candies give to 3 child 


  // why need to write "main" , as testing area , write in student.java is ok
  public static void main(String[] args) {
    Candy c1 = new Candy("RED", 3);
    Candy c2 = new Candy()"BLUE", 23);
    Candy c1 = new Candy("RED", 3);
    Candy c2 = new Candy()"BLUE", 23);
    Candy c1 = new Candy("RED", 3);
    Candy c2 = new Candy()"BLUE", 23);
    Candy c1 = new Candy("RED", 3);
    Candy c2 = new Candy()"BLUE", 23);
    Candy c1 = new Candy("RED", 3);
    Candy c2 = new Candy()"BLUE", 23);
    Candy c1 = new Candy("RED", 3);
    Candy c2 = new Candy()"BLUE", 23);

    //presentation
    public int getTotalNumbers() {
      int sum = 0;
      for (int i = 0; i < this.candies.length; i++) {
        sum += this.candies[i].getNumber();
      }
      return sum;
    }

    public int numberOfRed() {
      int sum = 0; 
      for (int i = 0; i < this.candies.length; i++) {
        if (this.candies[i].getColor().equals(""))
      }
    }

    // distribute number of certain number to 0 , use whileloop, flexible than forloop, 

















    // distribute 20 candies to 3 Student
    //every student has his own candies.
    // print out the candies (color, number) of every students (7,7,6)

    // for loop, while loop to distribute candy,
    // need to think who distribute, receive
    // teacher.java -> distribute 
    // student --> receive (Candy candy) ( who持有糖果的人) 
    // Candy (array)
    // OOP - think who will receive candy, then provide the method to that ppl


    // think abt below process , logic, 物件之間要溝通，要想物件之間的溝通，如老師派糖，戰士斬弓箭人，弓箭人被下降HP10， 想想DRIVER如何俾油，車增加速度，所以要想架車既ATTRITBUTE
    //warrior.attack(Archer)
    // public void attack (Acher archer) {
    // archer.deductHP(10);
    // }

    //


  }
  
}


