import java.util.*;
public class Sample33 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
        ArrayList<Integer> al2=new ArrayList();
    al2.add(5);
    al2.add(5);
    al2.add(7);
    System.out.println("well:"+al2.get(2));
    System.out.println(al2);
    al.addAll(al2);
    System.out.println(al);
    }
    
}
