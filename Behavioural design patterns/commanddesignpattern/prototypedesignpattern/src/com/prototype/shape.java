package com.prototype;

public class shape implements clone{
    int sides;
    double area;
    int dimensions;
    shape()
    {

    }


    shape(int sides,int dimensions,double area)
    {
        System.out.println(this.sides);
        this.sides=sides;
        this.area=area;
        this.dimensions=dimensions;

    }
    public clone getclone() throws Emptyobjectexception
    {
        if(this.sides==0 || this.dimensions==0 || this.area==0.0)
        {
            throw new Emptyobjectexception("the original instance is not allocated with parameters");
        }



        return new shape(sides,dimensions,area);

    }

}

