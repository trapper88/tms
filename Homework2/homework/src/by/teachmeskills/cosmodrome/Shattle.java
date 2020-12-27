package by.teachmeskills.cosmodrome;

public class Shattle implements IStart {

    private String name;

    public Shattle(String name) {
        this.name = name;
    }


    @Override
    public void startEngine() {
        System.out.println("Двигатели шаттла запущены, все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Шаттл " + name + " стартовал");
    }

    public String getName() {
        return name;
    }
}
