import java.util.Queue;
import java.util.PriorityQueue;

public class _015 {
  public static void main(String[] args) {
    Queue stuff = new PriorityQueue();
    stuff.add(21);
    stuff.add(50);
    stuff.add(36);
    stuff.add(36);
    stuff.remove(21);
    stuff.add(15);
    stuff.add(36);
    System.out.println(stuff);
  }
}
