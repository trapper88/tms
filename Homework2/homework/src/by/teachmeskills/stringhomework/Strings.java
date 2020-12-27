package by.teachmeskills.stringhomework;

public class Strings {

    public static void main(String[] args) {
//task1();
        task2();
    }

    static void task1(){

        String str = "Попробуем переложить эту ситуацию в код. Представим, что у нас есть два класса: Пруд и Авиарий.";
        String str2 = str.substring(str.indexOf("о"),str.lastIndexOf("р"));
        System.out.println(str2);
    }
    static void task2(){
        String str = "Попробуем переложить эту ситуацию в код. Представим, что у нас есть два класса: Пруд и Авиарий.";
        String str2 = str.replace(str.charAt(0),str.charAt(3));
        System.out.println(str2);

    }



}
