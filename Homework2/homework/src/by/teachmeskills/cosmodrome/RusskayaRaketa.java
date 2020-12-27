package by.teachmeskills.cosmodrome;

public class RusskayaRaketa implements IStart{
    private String name;

    public RusskayaRaketa(String name) {
        this.name = name;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели ракеты запущены, поехали");
    }

    @Override
    public void start() {
        System.out.println("У-и-и-и!!!!");
    }

    @Override
    public String getName() {
        return name;
    }
}
