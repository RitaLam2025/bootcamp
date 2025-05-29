public class Teacher {
  private Candy[] candies;

  public Teacher(Candy[] candies) {
    this.candies = candies;
  }

  public void distribute(Student[] students) {
    int count = candies.length;
    while (--count >= 0) { // 派到餘下零粒 
      for (int i = 0; i < students.length; i++){
        if (--count < 0) {
          completed = true;
          break;
        }
        distribute(students[i], candies[count]);
        this.candies[count] = null;
      }
      if (completed) {
        break;
      }
    } 
  }
  



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

    // new student[] {new Student(), new Student()}







  
}
