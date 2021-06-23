package abstractfactory;

public class WirelessDevicesFactory extends Abstractfactory {
    public  Computer getComputer(String DeviceType) throws NoDeviceFoundException

    {

        if(DeviceType.equalsIgnoreCase("laptop"))
        {
            return new Laptop();
        }
        if(DeviceType.equalsIgnoreCase("tab"))
        {
            return new Tab();
        }
        else
        {
            throw new NoDeviceFoundException("no device found");
        }

    }

}
