package abstractfactory;

public class FactoryProducer {
    public static Abstractfactory getFactory(boolean wired)
    {
        if(wired==true)
        {
            return new ConnectedDevicesFactory();
        }
        else
        {
            return new WirelessDevicesFactory();
        }

    }
}
