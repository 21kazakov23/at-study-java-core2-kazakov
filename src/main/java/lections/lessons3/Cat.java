package lections.lessons3;

public class Cat {
    int age;
    int weight;
    String name;

    static int count = 0;
    static void printCatCount() {
        System.out.println("“екущее колличество котов: " + count);
    }

    static class Head {


    }

    Cat(String name, int age, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        count++;
    }

    void voice() {
        System.out.println("ћ€у" + " " + age + " " + name);
    }

}
