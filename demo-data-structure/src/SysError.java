public class SysError {
  STAFF_NOT_FOUND(90000), ;

  private int code;

  private SysError(int code) {
    this.code = code;
  }

  public int getCode() {
    return this.code;
  }

  public String getMessage() {
    return this.message;
  }
}
