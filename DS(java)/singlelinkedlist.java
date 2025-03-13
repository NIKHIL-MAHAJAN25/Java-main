class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class linkedlist{
    private Node head;
    public linkedlist()
    {
        this.head=null;
    }
    public void addatstart(int data)
    {
        Node newnode= new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void addatlast(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else{
            Node current =head;
            while(current.next != null)
            {
                current=current.next;
            }
            current.next=newnode;
        }
    }
    public void addatmiddle(int data,int position)
    {
        if(position<0){
            System.out.println("position must be positive");
         return;
        }
       
        Node newnode = new Node(data);
        if(position==0)
        {
            addatstart(data);
            return;
        }
        Node current = head;
        for(int i=0;i<position-1 && current !=null;i++)
        {
            current = current.next;
        }
        if(current == null)
        {
            System.out.println("position out of bonds:");

        }
        else{
            newnode.next=current.next;
            current.next=newnode;
        }
    }
    public void traverse()
    {
        if(head==null)
        {
            System.out.println("the list is empty");
            return;
        }
        Node current = head;
        while(current != null)
        {
            System.out.println(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public void deleteatstart()
    {
        head=head.next;
    }
    public void deleteatlast()
    {
        if(this.head==null)
        {
            System.out.println("list is empty");
        }
        else{
            Node current = head;
            while(current.next.next!=null)
            {
                current=current.next;
            }
            current.next=null;
        }
    }
    public void deleteat(int position)
    {
        Node current=head;
        for(int i =1;i<position && current != null;i++)
        {
            current=current.next;
        }
        if(current == null)
        {
            System.out.println("position out of bonds");
        }
        else{
            Node deletenode=current.next;
            current.next=deletenode.next;
            deletenode.next=null;
        }

    }
    



}
public class singlelinkedlist{
    public static void main(String[] args) {
        linkedlist li = new linkedlist();
        
        li.addatstart(5);
        
        li.addatlast(20);
        li.addatlast(30);
        li.addatlast(40);
        
        li.addatmiddle(25, 3);
        li.deleteatlast();
        System.out.println("Linked List:");
        li.traverse();
    }
}








