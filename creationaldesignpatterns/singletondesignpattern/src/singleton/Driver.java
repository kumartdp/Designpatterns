package singleton;

public class Driver extends Thread{
    public static void main(String args[]) {
        Singleton sai = Singleton.getInstance("sai ");
        Singleton kumar = Singleton.getInstance("kumar");//here object does not dependent on reference type  variable it is dependent on constructor invoked
        Singleton zemoso = Singleton.getInstance("zemoso");
        sai.displayMessage();
        kumar.displayMessage();
        zemoso.displayMessage();
        Driver d = new Driver();
        d.start();
    }

    public void run() {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();
        t1.start();
        t2.start();
        t3.start();


    }
}
