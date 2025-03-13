class Animal {
    public void sound() {
        System.out.println("Animal makes some sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("woff woof");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("meow meow");
    }
}

public class Sample22 {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.sound();

        Dog dog = new Dog();
        Cat cat = new Cat();

        ani = dog;  
        ani.sound();  

        ani = cat;   
        ani.sound();  
    }
}
