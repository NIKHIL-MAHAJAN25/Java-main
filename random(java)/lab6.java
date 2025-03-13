abstract class shape{
    abstract double calarea();
    abstract double calperimeter();
}
class circle extends shape{
    private double radius;
    public circle(double radius)
    {
        this.radius=radius;
    }
    
    public double calarea()
    {
        return Math.PI*radius*radius;
    }
      
    public double calperimeter()
    {
        return 2*Math.PI*radius;
    }
}
class triangle extends shape
{
    private double side1,side2,side3;
    public triangle(int side1,int side2,int side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calarea()
    {
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s*(s-side1) * (s-side2) * (s-side3));
    }

    @Override   
    public double calperimeter()
    {
        return side1+side2+side3;
    }
}
public class lab6 {
    public static void main(String[] args) {
        circle c = new circle(5.0);
        System.out.println("Area of Circle is "+c.calarea());
        System.out.println("Perime of Circle is "+c.calperimeter());
        System.out.println();
        System.out.println();
        triangle t = new triangle(2, 2, 2);
        System.out.println("Area of trian is "+t.calarea());
        System.out.println("Perime of Trian is "+t.calperimeter());
    }
    
}
