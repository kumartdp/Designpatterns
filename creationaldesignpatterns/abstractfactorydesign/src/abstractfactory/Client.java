package abstractfactory;
import java.util.Scanner;

public class  Client{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            System.out.println("1.Get a device 2.exit");
            int a=sc.nextInt();
            if(a==2)
            {
                break;
            }
            else
            {
                try {

                    System.out.println("connected[y/n]");
                    String str=sc.next();
                    Abstractfactory factory=null;
                    if(str.equals("y"))
                    {
                        factory=FactoryProducer.getFactory(true);
                    }
                    else
                    {
                         factory=FactoryProducer.getFactory(false);

                    }
                    System.out.println("enter your required device");
                    String Device=sc.next();
                    Computer device=factory.getComputer(Device);
                    device.specifications();


                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }

    }


}
