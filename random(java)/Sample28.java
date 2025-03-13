import java.util.LinkedList;
public class Sample28 {
    public static void main(String[] args) 
    {
        LinkedList<String> list=new LinkedList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        System.out.println("list:"+list);
        list.addFirst("First element");
        System.out.println("list:"+list);
    }
}
