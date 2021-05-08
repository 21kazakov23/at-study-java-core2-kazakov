package lesson1.task1;

public class Radius {

    float calculateArea(int radiusA, int radiusB, float pi) {
        float result = radiusA * radiusB * pi;
        return result;
    }

    public static void main(String[] args) {
        Radius radius = new Radius();
        final int a = 0;
        final int b = 2;
        final int c = 100;
        final float pi = 3.14f;
        float area1 = radius.calculateArea(a, a , pi);
        float area2 = radius.calculateArea(b, b, pi);
        float area3 = radius.calculateArea(c, c, pi);
        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);
    }


}
