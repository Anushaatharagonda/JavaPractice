import java.util.*;
public class linkedlist
{
public static void main(String args[])
{
LinkedList a=new LinkedList();
a.add(13);
a.add("anu");
a.add('a');
a.add(true);
a.addFirst("anusha");
a.addLast("Ajay");
a.addLast("jatharagond");
a.addLast("Ajay");
a.addLast("jatharagond");
System.out.println(a);
System.out.println(a.size());
a.remove(3);
System.out.println(a);
System.out.println(a.get(1));
a.set(2,'s');
System.out.println(a);
}
}

