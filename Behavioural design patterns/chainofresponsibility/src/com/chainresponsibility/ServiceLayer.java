package com.chainresponsibility;

import java.util.ArrayList;

public class ServiceLayer extends Layer{
    ServiceLayer(int level) {
        this.level = level;
    }

    public void infoMessage(ArrayList<String> a)
    {
        System.out.println(a.get(this.level-1));




        if(a.get(this.level-1).equals("add")==true) {
            if (this.nextLayer != null) {
                this.nextLayer.infoMessage(a);

            }
            else {
                System.out.println("data access completed");
            }
        }
        else
        {
            System.out.println("At service Layer:::: no service found");
        }
    }
}
