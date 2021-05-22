package lesson1.task4;

public class Meter {
    public static void main(String[] args) {
        Meter meter = new Meter();
        System.out.println(meter.centimeter(115));
        System.out.println(meter.centimeter(800));
        System.out.println(meter.centimeter(278));

    }

    int centimeter(int a) {
        int b = a / 100;
        return b;
    }
}
