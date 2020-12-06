package code._4_student_effort;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

  public static void main(String[] args) {

    ArrayList<String> names = new ArrayList();
    names.add("Chaitanya");
    names.add("Steve");
    names.add("Jack");

    Iterator it = names.iterator();

    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
