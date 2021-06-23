package factory;





class noshapefound extends Exception{
    noshapefound(String s){
        super(s);
    }
}
public class factoryclass {
    public static shapes getinstance(String type) throws noshapefound {
        if(type.equals("triangle"))
        {
            return new triangle(3);
        }
        else if(type.equals("square"))
        {
            return new square(4);
        }
        else
        {
            throw new noshapefound("sorry the factroy class do not provide this geometricshape");
        }


    }
}
