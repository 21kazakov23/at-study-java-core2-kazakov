package lections.lessons3;

public class CatApplication {

    public static void main(String[] args) {

        Cat.printCatCount();

        Cat cat = new Cat("�������", 4, 8);
        Cat cat2 = new Cat("����������", 7, 8);

        cat.voice();
        cat2.voice();

        Cat.printCatCount();

        cat.count++;

        System.out.println(cat.count);


    }
}
