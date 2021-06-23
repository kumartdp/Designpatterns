package abstractfactory;

public abstract class Abstractfactory {
   public abstract Computer getComputer(String Devicetype) throws NoDeviceFoundException;
}
