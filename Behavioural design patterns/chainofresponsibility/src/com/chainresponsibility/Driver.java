package com.chainresponsibility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static  Layer getStartingChainObject()
    {
        Layer client=new com.chainresponsibility.Clientlayer(Layer.clientlayer);
        Layer service=new com.chainresponsibility.ServiceLayer(Layer.servicelayer);
        client.nextLayer(service);
        Layer DAO=new com.chainresponsibility.DaoLayer(Layer.daolayer);
        service.nextLayer(DAO);
        Layer database=new com.chainresponsibility.DataBaseLayer(Layer.databaselayer);
        DAO.nextLayer(database);

        return client;




    }
    public static  void main(String []args)
    {

        String username;
        String typeofService;
        String databaseentity;
        String dbusername;
        String dbpassword;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("enter 1 to continue data 2 to exit");
            int in=sc.nextInt();
            if(in==2)
            {
                break;
            }
            else
            {
                Layer layer=getStartingChainObject();
                ArrayList<String> a=new ArrayList<String>();
                System.out.println("enter username");
                username=sc.next();
                a.add(username);


                System.out.println("enter type of service");
                typeofService=sc.next();
                a.add(typeofService);


                System.out.println("enter database entity");
                databaseentity=sc.next();
                a.add(databaseentity);

                System.out.println("enter dbusername");
                dbusername=sc.next();
                a.add(dbusername);

                System.out.println("enter dbpassword");
                dbpassword=sc.next();
                a.add(dbpassword);
                System.out.println(a);


                layer.infoMessage(a);
            }

        }







    }
}
