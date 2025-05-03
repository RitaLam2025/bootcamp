public class USUni {
  private String Varname;
  private int Varadmissionrate;
  private String Varwebsite;

  public void setName(String name) {
    this.Varname = name;
  }

  public String getName() {
    return this.Varname;
  }

  public static void main(String[] args) {
    String USTop1 = "Princeton";
    int admissionrate = 3;
    String principalEmail = "christopher@princeton.edu";

    String USLiberalArt1 = "WilliamsCollege";
    int admission2rate = 5;
    String schoolwebsite = "williams.edu/about";

    USUni T1 = new USUni(); // new T1 uses class 
    T1.setName("Princeton");// T1 goes to setName , run Row 6 , 7
    System.out.println(T1.getName());
    // Row 24 run row 6, 7 and save it in class, get the name. 

    USUni T2 = new USUni();
    T2.setName("WilliamsCollege");
    System.out.println(T2.getName());

  }
  
}
