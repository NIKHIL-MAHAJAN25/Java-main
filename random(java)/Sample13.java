public class Sample13 {
    // Method to calculate the area of a square
    public static int area(int side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    public static int area(int length, int breadth) {
        return length * breadth;
    }

    // Method to calculate the area of a circle
    public static double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        // Calculate and print the areas
        System.out.println("Area of square: " + area(4));       
        System.out.println("Area of rectangle: " + area(2, 4));  
        System.out.println("Area of circle: " + area(3.14));        
    }
}
