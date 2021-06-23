package singleton;

public class thread1 extends Thread{
    public void run()
    {
        SingleTonsynch obj1 = SingleTonsynch.getInstance("user1 ");
        obj1.displayMessage();

    }
}
