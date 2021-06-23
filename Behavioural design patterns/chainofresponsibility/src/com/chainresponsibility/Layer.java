package com.chainresponsibility;

import java.util.ArrayList;

public abstract class Layer {
    public static int clientlayer=1;
    public static int servicelayer=2;
    public static int daolayer=3;
    public static int databaselayer=4;
    protected int level;
    protected  Layer nextLayer;
    public void nextLayer(Layer nextLayer)
    {
        this.nextLayer=nextLayer;
    }

    public abstract void infoMessage(ArrayList<String> ar);
}
