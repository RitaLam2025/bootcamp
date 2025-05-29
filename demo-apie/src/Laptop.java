// ! concrete class has to implement 了結 abstract method, 
public class Laptop extends Machine {
  private int ram;

  public Machine(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }

  @Override
  public void start() {
    System.out.println("Phone is starting....");
    super.turnOn();
  }

  @Override
  public void stop() {
    System.out.println("Laptop is stopping...");
    super.turnOff();
  }

  @Override

  //abstract method
  public abstract void start();

  public abstract void stop();

  public static void main(String[] args) {
    Machine phone = new Phone(17.5, "off");

    
  }
}
