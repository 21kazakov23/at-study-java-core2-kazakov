package lesson1.task2;

public class Rectangle {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.isSquareBiggerThanPerimeter(2, 7));
        System.out.println(rectangle.isSquareBiggerThanPerimeter(6, 5));
        System.out.println(rectangle.isSquareBiggerThanPerimeter(6, 3));
    }

    boolean isSquareBiggerThanPerimeter(int weight, int hight) {
        int square = hight * weight;
        int perimeter = 2 * (hight + weight);
        return square > perimeter;
    }


}


