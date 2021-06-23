package singleton;

public class Singleton {
    private static Singleton object;
    public String username;
    private Singleton(String username){
        this.username=username;
        System.out.println("Instance created by "+username);
    }
    public static Singleton getInstance(String username){
        if(object == null){
            object = new Singleton(username);
        }
        else{
            System.out.println("Object is already created");
        }
        return object;
    }
    public void displayMessage(){
        System.out.println("Displaying message from "+username);
    }
}
