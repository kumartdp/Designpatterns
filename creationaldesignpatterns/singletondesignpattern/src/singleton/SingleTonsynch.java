package singleton;

public class SingleTonsynch {
    private static SingleTonsynch object;
    public String username;
    private  SingleTonsynch(String username){
        this.username=username;
        System.out.println("Instance created by "+username);
    }

    public static  synchronized SingleTonsynch  getInstance(String username){
        if(object == null){

            object = new SingleTonsynch(username);

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
