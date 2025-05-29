// ! enum 
// ! When you exceute the main method, JVM create enum objects (Color.RED, color.BLUE) for you automatically
// RED and BLUE are 2 different n globally unique objects
// no need to use string, enum can use direction (eg, N, E,S, W), color (general), shapes of cards, 有限數，唔會成日改，eg, scroll down manual

//! 1, Finite number of values 有限數 - eg, currency (as this is the limited)
//! 2, Not usually changes (Add/remove) --> program change
public enum Color {
  // private String value; // RED, BLUE....
  RED, BLUE,; 

  
}
