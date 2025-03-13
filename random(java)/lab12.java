class mythread extends Thread
{
    public mythread(String threadname)
    {
        super(threadname);
    }
    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"-count"+i);
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
public class lab12 {
    public static void main(String[] args) {
        mythread thread=new mythread("Child Thread");
        thread.start();
        for(int i = 0; i <=5 ; i++) 
        {
            System.out.println(Thread.currentThread().getName() + "-Count" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
