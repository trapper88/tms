package by.teachmeskills.cosmodrome;

public class SpaceX implements IStart{
    private String name;

    public SpaceX(String name) {
        this.name = name;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели корабля запущены");
    }

    @Override
    public void start() {
        System.out.println("Корабль " + name + " стартовал");
    }

    @Override
    public String getName() {
        return name;
    }
}
