package by.teachmeskills.stringhomework.task4;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        String s = "Once a Lion decided to have a rest. While he’d been asleep a little Mouse started to run up and down" +
                " upon him. And he swallowed him. And then went asleep again near his dad.";

        StringBuilder out = new StringBuilder();

        String[] array = s.split("\\. ");

        for (int i = 0; i < array.length; i++) {
            if (TextFormatter.Pol(array[i])) {
                out.append(array[i] + "\n");
            } else{
                if (TextFormatter.wordsIn(array[i]) >=3  && TextFormatter.wordsIn(array[i]) <= 5) {
                    out.append(array[i] + "\n");
                }
            }
        }


        System.out.println(out.toString());
    }

}
