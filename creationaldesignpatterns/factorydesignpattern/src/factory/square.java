package factory;

public class square extends shapes{
    square(int sides)
    {
        this.sides=sides;

    }

    @Override
    public void area() {
        System.out.println("side*side");
    }
}
