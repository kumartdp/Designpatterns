package com.prototype;
import java.util.Scanner;

public class client {
    public static void main(String []args)
    {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter no of sides");
            int s = sc.nextInt();
            System.out.println("enter no of dimensions");
            int d = sc.nextInt();
            System.out.println("enter the area");
            double a = sc.nextDouble();
            shape original = new shape(s, d, a);
           // shape original1=new shape();
           // shape cloned1=(shape)original1.getclone();
            shape cloned = (shape) original.getclone();
            System.out.println("original dimensions" + original.dimensions);
            System.out.println("cloned dimensions" + cloned.dimensions);
            original.dimensions += 1;
            System.out.println("cloned dimensions" + cloned.dimensions);
            shape copy = original;
            System.out.println("originaal dimensions" + original.dimensions);
            System.out.println("copy dimensions" + copy.dimensions);
            original.dimensions += 1;
            System.out.println("copy dimensions" + copy.dimensions);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }








    }
}

