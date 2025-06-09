public class Person { // when to 
  private Long id;
  private Double Height;
  private Double Weight;

  public static Builder builder() {
    return new Builder();
    this.id = id;
    this.weight= weight;
    this.height= height;
  }

  public Person(Long id, Double height, Double weight) {

  }

  public Builder height(Double height) {

  }

  public static class Builder {
    private Long id;
    private Double Height;
    private Double Weight;


    public Builder setId(Long id) {
      this.id = id;
      return this;
    }
     
    public Builder setHeight(Double height) {
      this.height = height;
      return this;
    }

    public Builder setWeight(Double Weight) {
      this.weight = weight;
      return this;
    }

    public Person build() {
      return new Person(this.id, this.height, this weight);
    }

    public static void main(String[] args) {
      Person p1 = new Person(1L, 1.76, 75.0);

      Person p2 = Person.builder()//
      .id(1L) //
      .height(1.76) //
      .weight(75.0) //
      .build();
      
      // ! Advantages:
      // 1, easy to review the mapping
      // 2, easy to manage null values for initial object
    }

  }

}
