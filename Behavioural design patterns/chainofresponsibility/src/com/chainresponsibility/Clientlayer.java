package com.chainresponsibility;

import java.util.ArrayList;

public class Clientlayer extends Layer {
    Clientlayer(int level) {
        this.level = level;
    }

    public void infoMessage(ArrayList<String> a)
    {
        if(a.get(this.level-1).length()>3)
        {
            if(this.nextLayer!=null)
            {
                this.nextLayer.infoMessage(a);

            }
            else
            {
                System.out.println("data access completed");
            }
        }
        else
        {
            System.out.println("At Client Layer:::: invalid username");
        }
    }


}


