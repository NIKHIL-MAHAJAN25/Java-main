class Mypoint 
{
    int x;
    int y;

    public Mypoint()
    {
        x = 0;
        y = 0;
    }

    public Mypoint(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public void SetXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int[] GetXY(int x , int y)
    {
        return new int[]{this.x , this.y};
    }

    @Override
    public String toString()
    {
        return "Mypoint [ x = " + x + " y = " + y +" ]" ;
    }

    public double distance(int x , int y)
    {
        return Math.sqrt(Math.pow(this.x - x , 2) + Math.pow(this.y - y , 2));
    }

    public double distance(Mypoint other)
    {
        return distance(other.x , other.y);
    }

    public double distance()
    {
        return distance(0,0);
    }
}
public class lab4
{
    public static void main(String[] args) {
        Mypoint p1 = new Mypoint();
        Mypoint p2 = new Mypoint(2,2);

        System.out.println("Default point1 = "+ p1);
        System.out.println("overloaded point2 = "+ p2);
        p1.SetXY(1, 1);
        System.out.println("used set method on point 1: "+p1);

        System.out.println("distance from 4,6 is "+p1.distance(4,6));

        System.out.println("distance from point 2 is : "+p1.distance(p2));

        System.out.println("distance from origin: "+p1.distance());
    
    }
}