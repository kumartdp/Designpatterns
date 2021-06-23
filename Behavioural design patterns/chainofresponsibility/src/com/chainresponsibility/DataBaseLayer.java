package com.chainresponsibility;

import java.util.ArrayList;

public class DataBaseLayer extends Layer{
    DataBaseLayer(int level) {
        this.level = level;
    }

    public void infoMessage(ArrayList<String> ar)
    {



        if(ar.get(this.level-1).equals("sai") && ar.get(this.level).equals("123"))
        {
            System.out.println("entered");
            if(this.nextLayer!=null)
            {
                this.nextLayer.infoMessage(ar);

            }
            else
            {
                System.out.println("data service completed");
            }

        }
        else
        {
            System.out.println("At data base layer:::: invalid db credentials");
        }
    }
}
