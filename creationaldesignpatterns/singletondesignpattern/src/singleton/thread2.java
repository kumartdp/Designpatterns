package singleton;

public class thread2 extends  Thread{

        public void run()
        {
            SingleTonsynch obj2 = SingleTonsynch.getInstance("user2 ");
            obj2.displayMessage();

        }



}
