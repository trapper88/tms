package by.teachmeskills.robot;


import by.teachmeskills.robot.hands.SamsungHands;
import by.teachmeskills.robot.hands.SonyHands;
import by.teachmeskills.robot.hands.ToshibaHands;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot terminator = new Robot(new SonyHead(50), new SamsungHands(40), new ToshibaLeg(30));
        Robot transformer = new Robot(new ToshibaHead(60), new SonyHands(20), new SamsungLeg(30));
        Robot robocop = new Robot(new SamsungHead(40), new ToshibaHands(25), new SonyLeg(80));

        terminator.action();
        transformer.action();
        robocop.action();

        if (terminator.getPrice() > transformer.getPrice() && terminator.getPrice() > robocop.getPrice()) {
            System.out.println("\n" + "Terminator самый дорогой");
        } else {
            if (transformer.getPrice() > terminator.getPrice() && transformer.getPrice() > robocop.getPrice()) {
                System.out.println("\n" + "Transformer самый дорогой");
            } else {
                System.out.println("\n" + "Robocop самый дорогой");
            }
        }
        int max = Math.max(Math.max(terminator.getPrice(), transformer.getPrice()), robocop.getPrice());
        System.out.println("\n" + "Стоимость самого дорогого робота = " + max);


    }

}
