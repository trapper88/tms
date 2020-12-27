package by.teachmeskills.stringhomework.task3;

public class Main {
    public static void main(String[] args) {
        String file1 = "dad" + "\ndid" + "\na" + "\ndeed" + "\nevery" + "\nday";
        String file2;
        StringBuilder a = new StringBuilder();
        String[] starr = file1.split("\n");

        for (int i = 0; i < starr.length; i++) {
            StringBuilder b = new StringBuilder(starr[i]);
            b.reverse();
            if (starr[i].equals(b.toString())) {
                a.append(starr[i] + " ");
            }
        }
        file2 = a.toString();
        System.out.println(file2);

    }
}
