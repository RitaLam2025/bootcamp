// ! once the class extends RuntimeException, the class can be thrown or try-catch.
public class StaffNotFoundException extends RuntimeException {
  public StaffNotFoundException(String message) {
    super(message);
  }
  
}
