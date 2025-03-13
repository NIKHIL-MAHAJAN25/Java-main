class figure
{
    public void draw()
    {
        System.out.println("drawing a shape:");
    }
    public void erase()
    {
        System.out.println("rasing a shape:");
    }
}
    class circle extends figure
    {
        @Override
        public void draw()
        {
            System.out.println("drawing a circle:");
        }
        @Override
        public void erase()
        {
            System.out.println("easing a circle:");
        }
    }
    class triangle extends figure
    {
        @Override
        public void draw()
        {
            System.out.println("drawing a triangle:");
        }
        @Override
        public void erase()
        {
            System.out.println("easing a triangle:");
        }
    }


public class lab5
{
    public static void main(String[] args) {
        figure obj=new figure();
        obj.draw();
        obj.erase();
        circle c = new circle();
        c.draw();
        c.erase();
    }
}