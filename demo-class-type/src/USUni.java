public class USUni {
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static void main(String[] args) {
    String USTop1 = "Princeton";
    int admissionrate = 3;
    String principalEmail = "christopher@princeton.edu";

    String USLiberalArt1 = "WilliamsCollege";
    int admission2rate = 5;
    String schoolwebsite = "williams.edu/about";

    USUni T1 = new USUni(); 
    T1.setName("Princeton");
    System.out.println(T1.getName());

    USUni T2 = new USUni();
    T2.setName("WilliamsCollege");
    System.out.println(T2.getName());
  }
  
}
