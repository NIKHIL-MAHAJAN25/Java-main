class q
{
    int capacity;
    int arr[]=new int[capacity];                                                                                                                                                                    
    int front = -1;
    int rear;
    q(int newcapacity)
    {
        arr=new int[newcapacity];
        front=-1;
        rear=-1;
        capacity=newcapacity;
    }
    boolean isempty()
    {
        if(front==-1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    boolean isfull()
    {
        return(rear==(capacity-1));
    }
    int front()
    {
        if(isempty())
        {
            System.out.println("queue is empty");
            return -1;
        }
        else{
            return arr[front];
        }
    }
    boolean enqueue(int newv)
    {
        if(isfull())
        {
            System.out.println("queue is full");
        }
        if(isempty())
        {
            rear+=1;
            arr[rear]=newv;
            front=0;
            return true;
        }
        else{
            rear=rear+1;
            arr[rear]=newv;
            return true;
        }
    }
    int dequeue()
    {
        if(isempty())
        {
            System.out.println("queue is empty");
            return -1;
        }
        else{
            if(front>=rear)
            {
                int remove=arr[front];
            
            front=-1;
            rear=-1;
            return remove;
            }
            else
            {
                int remove=arr[front];
                front=front+1;
                return remove;
            }
        }
    }
    void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
public class queqe {
    public static void main(String[] args) {
        q qu=new q(5);
        qu.enqueue(1);
        qu.enqueue(2);
        qu.enqueue(3);
        qu.enqueue(4);
        System.out.println("pop:"+qu.dequeue());
        qu.enqueue(7);
       
        qu.display();
    }
}
