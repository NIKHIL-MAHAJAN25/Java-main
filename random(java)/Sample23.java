
interface Vehicle {
    void drive();  
}


interface Engine {
    void startE();  
}


class Car implements Vehicle, Engine {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public void startE() {
        System.out.println("Engine started");
    }
}


public class Sample23 {
    public static void main(String[] args) {
        Car myCar = new Car();

        
        myCar.startE();  
        myCar.drive();        
    }
}

