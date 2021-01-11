package ru.muffincolor;

public class Main {

    byte b = 1;
    short s = 2;
    int i = 0;
    long l = 5L;

    float f = 2.0f;
    double d = 4.4423;

    char c = 'p';
    boolean bool = true;

    public static void main(String[] args) {
        System.out.println(calculatePattern(1.0f, 2.3f, 4.3f, 2.3f));
        System.out.println(checkSum(10, 1));
        System.out.println(checkNumber(10));
        sayHello("Дмитрий");
        System.out.println(checkYear(104));
    }

    public static float calculatePattern(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean checkSum(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    public static boolean checkNumber(int number) {
        return number < 0;
    }

    public static void sayHello(String username) {
        System.out.println("Привет, " + username + "!");
    }

    public static boolean checkYear(int year) {
        return year % 4 == 0 || (year % 100 != 0 && year % 400 == 0);
    }
}
