import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) { // below can check the picture//
    //Queue
    // 1. add() --> addLast()

    Queue<String> fruits = new ArrayDeque<>(); // base on LHS, polymorphism, can also name as Arraydeque
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("lemon");
    System.out.println(fruits.poll()); //apple (take away first element from the queue)
    System.out.println(fruits.size()); //2
    System.out.println(fruits.peek()); // orange, peek = take a look on the first element)
    System.out.println(fruits.size()); //2
    //no get() method in Queue , arrange ppl to the queue, n arrange the ppl coming out
    
    //!! the most common logic to use a queue.//
    while (! fruits.isEmpty()) {
      System.out.println(fruits.poll());
    }
    if (fruits.contains("lemon")) {

    }

    //! why queue? arraylist is also with ordering
    // 1. queue has less method to use (specific usage) whie list is more general for more scenario.

    // ! the difference between linkedList & arraydeque, while using Queue interface
    // 1. the underlying data structure // use Chat gpt to learn

    // ! Deque: add & remove from first element and last element 
    Deque<String> fruits2 = new LinkedList<>();
    fruits2.addLast("apple");
    fruits2.addFirst("orange");
    fruits2.addFirst("lemon");
    fruits2.addLast("waterlemon");
    System.out.println(fruits2);// lemon, orange, apple, waterlemon
    System.out.println(fruits2.size());
    if (fruits2.contains("orange")) {

    }
    //List<String> fruit3 = new LinkedList<>();
  }
}
