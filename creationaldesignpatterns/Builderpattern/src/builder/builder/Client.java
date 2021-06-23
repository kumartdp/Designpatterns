package builder;

import java.util.Scanner;

public class Client {
   public static void main(String [] args)
   {
       Scanner sc=new Scanner(System.in);
       while(true)
       {
           System.out.println("enter 1 to get required computer 2 to exit");
           int c=sc.nextInt();
           if(c==2)
           {
               break;
           }
           else
           {
               System.out.println("enter y to get extra accessories n to get normal computer");
               String t=sc.next();
               if(t.equals("y"))
               {
                   Computer comp=new ComputerBuilder().setDiskSize(500).setGraphiccard(512).setJoysticktype("manual").setRam(4).setScreensize(22).getComputer();
                   System.out.println(comp);

               }
               else
               {
                   Computer comp=new ComputerBuilder().setDiskSize(500).setRam(4).setScreensize(22).getComputer();
                   System.out.println(comp);


               }
           }
       }
   }
}
