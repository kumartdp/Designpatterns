package builder;

public class Computer {
    //required
    private int diskSize;
    private int ram;
    private int screensize;
    //optional
    private int graphiccard;
    private String joysticktype;
    public Computer(int diskSize,int ram,int screensize,int graphiccard,String joysticktype)
    {
        this.diskSize=diskSize;
        this.ram=ram;
        this.screensize=screensize;
        this.graphiccard=graphiccard;
        this.joysticktype=joysticktype;

    }
    public String toString()
    {
        return "diskSize "+diskSize+" ram "+ram+" screensize "+screensize+" graphiccard "+graphiccard+" joysticktype "+joysticktype;
    }



}
