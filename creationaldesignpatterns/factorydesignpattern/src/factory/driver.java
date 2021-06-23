package factory;
import java.util.Scanner;
public class driver {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.enter your required geometric shape ");
            System.out.println("2.enter n to exit");
            String s=sc.nextLine();
            if(s.equals("n"))
            {
                break;

            }
            else {
                try {

                    shapes sh = factoryclass.getinstance(s);
                    sh.area();
                    System.out.println("your required geometric shape is created");
                }
                catch(Exception e)
                {
                    System.out.println(e);

                }
            }


        }
    }
}
