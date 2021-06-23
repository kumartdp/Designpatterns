package builder;

public class ComputerBuilder {

    //required
    private int diskSize;
    private int ram;
    private int screensize;

    //optional
    private int graphiccard;
    private String joysticktype;

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder  setScreensize(int screensize) {
        this.screensize = screensize;
        return this;
    }

    public ComputerBuilder  setGraphiccard(int graphiccard) {
        this.graphiccard = graphiccard;
        return this;
    }

    public ComputerBuilder  setJoysticktype(String joysticktype) {
        this.joysticktype = joysticktype;
        return this;
    }

    public ComputerBuilder  setDiskSize(int diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Computer getComputer()
    {
        return new Computer(diskSize,ram,screensize,graphiccard,joysticktype);

    }



}
