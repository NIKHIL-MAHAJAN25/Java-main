class outer{
    void display()
    {
        System.out.println("outer class display method");
    }
    class inner{
        void display()
        {
            System.out.println("Inner class display method");
        }
    }
}
public class lab8 {
    public static void main(String[] args) {
        outer o = new outer();
        o.display();
        outer.inner in=o.new inner();
        in.display();

    }
    
}
