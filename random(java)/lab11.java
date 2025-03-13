class myrunnable implements Runnable{
    String threadnum;
    public myrunnable(String name)
    {
        this.threadnum=name;
    }
    @Override
    public void run()
    {
        try{
            for(int i=0;i<=5;i++)
            {
                System.out.println(threadnum+"-count"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
public class lab11 
{
    public static void main(String[] args) {
        myrunnable run1=new myrunnable("Thread1");
        myrunnable run2=new myrunnable("Thread2");
        Thread thread1=new Thread(run1);
        Thread thread2=new Thread(run2);
        thread1.start();
        thread2.start();

    }
}
