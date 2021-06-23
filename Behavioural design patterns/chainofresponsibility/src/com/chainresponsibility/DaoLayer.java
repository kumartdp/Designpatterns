package com.chainresponsibility;

import java.util.ArrayList;

public class DaoLayer extends Layer{
    DaoLayer(int level) {
        this.level = level;
    }

    public void infoMessage(ArrayList<String> ar)
    {
        String entity="employee";
        if(ar.get(this.level-1).equals(entity))
        {
            System.out.println("entered");
            if(this.nextLayer!=null)
            {
                this.nextLayer.infoMessage(ar);

            }
            else
            {
                System.out.println("data access completed");
            }
        }
        else
        {
            System.out.println("At dao Layer:::: invalid entity");
        }
    }
}
