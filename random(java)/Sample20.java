
class Grandparent {
    String grandparentName;

    
    public Grandparent(String grandparentName) {
        this.grandparentName = grandparentName;  
    }

    
    public void displayGran() {
        System.out.println("Grandparent Name: " + grandparentName);
    }
}


class Parent extends Grandparent {
    String parentName;

    
    public Parent(String grandparentName, String parentName) {
        super(grandparentName);  
        this.parentName = parentName;  
        }

    
    public void displayParent() {
        displayGran();  
        System.out.println("Parent Name: " + parentName);
    }
}


class Child extends Parent {
    String childName;

    
    public Child(String grandparentName, String parentName, String childName) {
        super(grandparentName, parentName);  
        this.childName = childName;  
    }

    
    public void displayChild() {
        displayParent();  
        System.out.println("Child Name: " + childName);
    }
}


public class Sample20 {
    public static void main(String[] args) {
        
        Child child = new Child("c", "b", "a");
        System.out.println("Family Tree Info:");
        child.displayChild();  
    }
}
        
       
