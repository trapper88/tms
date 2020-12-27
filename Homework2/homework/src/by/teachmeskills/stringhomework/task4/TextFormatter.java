package by.teachmeskills.stringhomework.task4;

public class TextFormatter {

    public static int wordsIn(String s) {
        int i = 0;
        String[] arr = s.split("[\\s\\,]");
        i = arr.length;
        return i;
    }

    public static boolean Pol(String s) {
        boolean bul = false;
        String[] arr = s.split("[\\s\\,]");

        for (int i = 0; i < arr.length; i++) {
            StringBuilder b = new StringBuilder(arr[i]);
            b.reverse();
            if (arr[i].equals(b.toString())) {
                bul = true;
                break;
            } else {
                bul = false;
            }
        }
        return bul;
    }
}
