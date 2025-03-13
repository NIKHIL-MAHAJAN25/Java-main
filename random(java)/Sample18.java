class Student{
    String rollno;
    int age;
    int contact;
    String section;
    String name;

    public Student(String rollno,
    int age,
    int contact,
    String section,
    String name)
    {
        this.name=name;
        this.age=age;
        this.rollno=rollno;
        this.contact=contact;
        this.section=section;
    }

public void display()
{
    System.out.println("Name:" + name);
    System.out.println("Student age"+age);
    System.out.println("Student contact"+contact);
    System.out.println("Rollno"+rollno);
    System.out.println("section"+section);
}
}
public class Sample18{
    public static void main(String[] args) {
        Student student1 = new Student("101", 18, 1234567890, "A", "vir");
        Student student2 = new Student("18",18,36272727,"a","Nikhil");
        student1.display();
        student2.display();
    }
}
