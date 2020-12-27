package by.teachmeskills.cosmodrome;

public class Cosmodrome {

    public void zapusk(IStart istart) {
        if (istart.check() == false) {
            System.out.println("Предстартовая проверка " + istart.getName() + " провалилась");
        } else {
            System.out.println("Предстартовая проверка " + istart.getName() + " прошла успешно");
            istart.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            istart.start();
        }
    }
}
