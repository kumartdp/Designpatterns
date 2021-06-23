package abstractfactory;


public class ConnectedDevicesFactory extends Abstractfactory{
    public  Computer getComputer(String DeviceType) throws NoDeviceFoundException {

        if(DeviceType.equalsIgnoreCase("Desktop"))
        {
            return new Desktop();
        }
        else
        {
            throw new NoDeviceFoundException("no device found");
        }


    }

}
