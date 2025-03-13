class stack1 {
    int capacity;
    int arr[]=new int[capacity];
    int top;
    stack1(int size)
    {
        capacity=size;
        top=-1;
        arr = new int[size];
    }
    boolean isempty()
    {
        return top<0;
    }
    boolean isfull()
    {
        return top>=(capacity-1);
    }
    boolean push(int value)
    {
        if(isfull())
        {
            System.out.println("stack is full");
            return false;
        }
        else{
            top+=1;
            arr[top]=value;
            return true;
        }
    }
    int pop(int remove)
    {
        if(isempty())
        {
            System.out.println("stack is empty");
           return -1;
        }
        else{
            
            remove=arr[top];
            top--;
            return remove;

        }
    }
    int peek()
    {
        if(isempty())
        {
            System.out.println("stack is empty");
            return -1;
        }
        else{
            return arr[top];
        }
    }
    void display()
    {
        if(isempty())
        {
            System.out.println("stack is empty");
            
        }
        else{
            for(int i=top;i>=0;i--)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
public class stack{
    public static void main(String[] args) {
        stack1 st=new stack1(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("top:"+st.peek());
        System.out.println("pop element"+st.pop(2));
        st.display();
    }
}
// class stack1{
//     int capacity;
//     int top;
//     int arr[]=new int[capacity];
//     stack1(int size)
//     {
//         capacity=size;
//         top=-1;
//         arr=new int[size];
//     }
//     boolean isfull()
//     {
//         return top>=(capacity-1);
//     }
//     boolean isempty()
//     {
//         return top<=0;
//     }
//     int push(int item)
//     {
//         if(isfull())
//         {
//             System.out.println("stack overflow");
//             return 0;
//         }
//         else{
//             top++;
//             arr[top]=item;
//             return 1;
//         }

//     }
//     int pop()
//     {
//         if(isempty())
//         {
//             System.out.println("stack underflow");
//             return 0;
//         }
//         else
//         {
//             int removed=arr[top];
//             top--;
//             System.out.println("removed item is:"+removed);
//             return 1;
//         }
//     }
//     void display()
//     {
//         int i;
//         for(i=top;i>=0;i--)
//         {
//             System.out.println("element:"+arr[i]);
//         }
//     }
// }
// public class stack{
//     public static void main(String[] args) {
//         stack1 st=new stack1(5);
//         st.push(1);
//         st.push(2);
//         st.push(3);
//         st.push(4);
//         st.push(5);
//         st.pop();
//         st.display();
            

        
//     }
// }
