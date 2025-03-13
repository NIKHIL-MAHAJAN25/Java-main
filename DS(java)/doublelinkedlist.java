class node{
    int data;
    node prev;
    node next;
    public node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DLL{
    private node head;
    private node tail;
    public DLL()
    {
        this.head=null;
        this.tail=null;
    }

public void addatlast(int data)
{
    node newnode=new node(data);
    if(head==null)
    {
        head=newnode;
        tail=newnode;
    }
    else{
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }
}
public void addatfront(int data)
{
    node newnode = new node(data);
    if(head==null)
    {
        head=newnode;
        tail=newnode;
    }
    else{
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }

}
public void deleteatfront()
{
    if(head==null)
    {
        System.out.println("list is empty");
    }
    else{
        head=head.next;
        if(head!=null)
        {
            head.prev=null;
        }
        else{
            tail=null;
        }
    }
}
public void deleteatlast()
{
    if(tail==null)
    {
        System.out.println("list is empty");
    }
    else{
        tail=tail.prev;
        if(tail!=null)
        {
            tail.next=null;
        }
        else{
            head=null;
        }
    }
}
public void displayforward()
{
    if (head == null) {
        System.out.println("The list is empty");
        return;
}
node current =head;
System.out.println("list(forward):");
while(current!=null)
{
    System.out.println(current.data+" ");
    current=current.next;
}
System.out.println();
}
public void traverseBackward() {
    if (tail == null) {
        System.out.println("The list is empty");
        return;
    }
    node current = tail;
    System.out.print("List (backward): ");
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.prev;
    }
    System.out.println();
}

}
public class doublelinkedlist{
    public static void main(String[] args) {
        DLL list=new DLL();
        list.addatfront(10);
        list.addatlast(20);
        list.addatlast(30);
        list.displayforward(); // Expected output: 10 20 25 30
        list.traverseBackward();
        list.deleteatfront();
        list.deleteatlast();
    }
}