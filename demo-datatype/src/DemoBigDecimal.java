import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    double r1 = 0.1 + 0.2;
    System.out.println(r1);// 0.30000000000004, 電腦是二進制，是出不到

    // 2 approaches to create Bigdecimal Object
    // as bd 1 not primitive, cant use +, -
    BigDecimal bd1 = new BigDecimal("0.1"); // give string then use this one
    BigDecimal bd2 = BigDecimal.valueOf(0.2); // always double value, put double into a box
    BigDecimal bd3 = bd1.add(bd2); //  maths "+" operation
    System.out.println(bd3);

    float f1 = bd3.floatValue(); // a tool to change the 形態，但唔會影響個值
    System.out.println(f1); 
    double d1 = bd3.doubleValue();
    System.out.println(d1);
    int i1 = bd3.intValue();
    System.out.println(i1);

    String s1 = bd3.toString();
    System.out.println(s1);

    // subtract(), multiply()
    BigDecimal bd4 = bd1.subtract(bd2);
    System.out.println(bd4); //-0.1

    System.out.println(0.3-0.1); //0.199999999 not ok
    double result = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(result); // 0.2
    // 0.3 take out as decimal, then subtract, at the end show as double

    System.out.println(0.1 * 0.2); // 0.022222 not oj
    double result2 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2)).doubleValue();
    System.out.println(result2);// 0.02

    //multiply --> handle decimal places
    // 3.33333
    // multiply , use Setscale to round to exact decimal

    // divide
    System.out.println(0.3 / 0.1); //2.999999999 not ok
    double result3 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(result3); //3

    // 10 / 3 --> 3.333333333...
    // non terminating decimal expansion // 1, use 3 to divide, 2, 2 decimals 2 個小數位，3，round up, round down
    // rounding mode down --> 
    // half up --> 五入 ，4捨5入 ，6 to 9 --> 進 1，8.25 --》8.3
    // divide --> answer 會係無儘

    // 8.25
    double result5 = BigDecimal.valueOf(16.5).divide(BigDecimal.valueOf(2, 1, RoundingMode.DOWN).doubleValue());

    // x divide 0 --> undefined
    // 0 divide x -> 0
    // BigDecimal.valueOf(9.9).divide(BigDecimal.valueOf(0)); //error, division by zero --> undefined


  }
}
