// ! once the class extends RuntimeException, the class can be thrown or try-catch.
// ! RuntimeException --> Unchecked Exception (optional to handle)
// ! Exception --> Checked Exception (must - 2 ways to handle: try-catch or throws)
// RuntimeException has getMessage()

public class NotFoundException extends Exception {
  public NotFoundException(String message) {
    super(message);
  }
  
}
