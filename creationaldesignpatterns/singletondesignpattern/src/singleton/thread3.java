package singleton;

public class thread3 extends Thread{
    public void run()
    {
        SingleTonsynch obj3 = SingleTonsynch.getInstance("user3 ");
        obj3.displayMessage();

    }

}
