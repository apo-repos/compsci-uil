import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _021 {
  public static void main(String[] args) {
    String stuff = "dog cat booty funny";
    stuff += "salad bottom abba";

    String[] words = stuff.split("\\s+");

    ArrayList<String> list;
    list = new ArrayList<String>();

    for(int i=0; i<words.length; i++) {
      char[] cRay = words[i].toCharArray();
      Arrays.sort(cRay);
      String s = "";
      for( char c : cRay)
        if(s.indexOf(c)==-1)
          s+=c;
      list.add(s);
    }
    System.out.println(list.size());

    Collections.sort(list);

    System.out.println( list.get(0) );
    System.out.println( list.get(5) );
  }
}
