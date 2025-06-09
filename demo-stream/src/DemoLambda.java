// Java 8 (2014), major release for Java

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// ! Function, predicate, Consumer!! ** - always use 
public class DemoLambda {
    public static void main(String[] args) {
     // function 
     // f(x) = y 

     // !Lambda Expressions (After Java 8)
     // Function<String, Integer> --> Input (String) -> Output (Integer)
     Function<String, Integer> stringLengthFormula = (str) -> str.length(); // method implementation
     System.out.println(stringLengthFormula.apply("hello"));// 5 , ater execution
     // source of object use "runtime"

     // ! Before  Java 8
     // ! Java classic way to define clas, and then use the method
     Function<String, Integers> stringLengthFormula2
     // ! more than 1 line of code, use {}
     Function<String, Boolean> searchAFunction = (str) -> {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A')
            return true;
        }
        return false; 
     };
     //
     System.out.println(searchAFunction.apply("Lucas")); // false
     System.out.println(searchAFunction.apply("Apple"));// true , as char starts at A


     // BiFunction
     // 2 inputs --> 1 output
     BiFunction<String, String, String> concaFunction = (s1, s2) -> s1.concat(s2);
     System.out.println(concaFunction.apply("abc", "def"));
     

     // !! consumer // 1 parameter no need put bracket ( see RHS)
     Consumer<String> stringPrinter = s -> System.out.println(s);
     stringPrinter.accept("hello"); // hello
     stringPrinter.accept("bootcamp"); // bootcamp

     BiConsumer<Double, Integer> printCheckOutAmount = 
     (price, quantity) -> System.out.println(price * quantity);
     printCheckOutAmount.accept(3.9, 5); // 19.5
 
     //Supplier
     Supplier<Integer> randomNumberGenerator = () -> new random().nextInt(49) + 1; // 1 - 49
     System.out.println(randomNumberGenerator.get());

     //!! Predicate // = formula (decide true, false )
     boolean isAdult = true; // already has the result, either true/false , is a value
     Predicate<Integer> adultDefinition = age -> age >= 18;// is a formula,
     // variable , eg Adultdefinition --> method
     // predicate is with .test
     System.out.println(adultDefinition.test(17)); //false
     System.out.println(adultDefinition.test(18)); // true 

     BiPredicate<String, Integer> isNameTooLong = 
     (name, upperlimit) -> name.length() > upperlimit;
     System.out.println(isNameTooLong.test("John",5));// false
     System.out.println(isNameTooLong.test("Vincent", 5)); // true

     // UnaryOperator
     BiFunction<String, String, String> replaceXXFunction =
      (source, from) -> source.replace(from, "XX");
      System.out.println(replaceXXFunction.apply("hello", "ll")); //hexxo

      BinaryOperator<String> replaceXXFunction2 =
      (source, from) -> source.replace(from, "XX");

      //for-each
      List<Dog> dogs = 
      new ArrayList<>(Arrays.asList(new Dog("John", 10), new Dog("Peter")));
      for (Dog d : dogs) {
        System.out.println(d.getName());
      }
      
      // need to know how to write below ->
      dogs.forEach(d -> System.out.println(d.getName()));
      dogs.forEach(d -> {
        System.out.println("Dog Info:");
        System.out.println(d.getName());
        System.out.println(d.getAge());
      }); // each dog needs to go thru above 3 sentences

    Function<Dog.String> getDogNameFunction = dog -> dog.getName();
    // LHS - dog: input parameter ; RHS: output
    getDogNameFunction.apply(new Dog("John", 10)); // John, execution

    // same as above function 
    public static String getDogName(Dog dog) {
      return dog.getName();
    }
    public static class Dog {
      private String name;
      private int age;

      public Dog(String name, int age) {
        this.name = name;
        this.age = age;
      }
      
      public int getAge() {
        return this.age;
      }

      public String getName() {
        return this.name;
      }
    }


     }
    }

