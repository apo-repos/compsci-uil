import java.util.Collection;
import java.util.ArrayList;
import java.util.Stack;
import java.util.List;


public class _014 {
  static List smack(Collection c) {
    Stack s = new Stack();
    s.addAll(c);
    List ret = new ArrayList();
    while(!s.isEmpty())
      ret.add(s.pop());
    return ret;
  }

  public static void main(String[] args) {
    Collection<String> c = new ArrayList<>();
    c.add("A");
    c.add("B");
    c.add("C");
    List l = smack(c);
    System.out.println(l);
  }
}
