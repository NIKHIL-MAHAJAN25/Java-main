class dog{
    String ownname;
    String breed;
    public dog(String ownname,String breed)
    {
        this.ownname=ownname;
        this.breed=breed;
    }
    public String own()
    {
        return "owner name is"+ownname;
    }
}
class gdog extends dog{
    String task;
    public gdog(String ownname,String breed,String task)
    {
        super(ownname,breed);
        this.task=task;
    }
    public String displayInfo() {
        return breed + " trained for " + task + ".";
    }
}
class gdogarea extends dog {
    String gdogarea;

    
    public gdogarea(String name, String breed, String gdogarea ) {
        super(name, breed);
        this.gdogarea=gdogarea;
    }

    public String displayInfo() {
        return breed + " guarding the " + gdogarea + ".";
    }
}
public class Sample19 {
    public static void main(String[] args) {
        
        dog dog1 = new dog("Max", "German Shepherd");
        gdog dog2 = new gdog("Buddy", "Labrador", "protecting");
        gdogarea dog3 = new gdogarea("Rex", "Rottweiler", "warehouse");

        
        System.out.println(dog1.own());  
        System.out.println(dog2.displayInfo());  
        System.out.println(dog3.displayInfo());  

        
        System.out.println(dog1.own()); 
        System.out.println(dog2.own());  
        System.out.println(dog3.own());  
    }
}