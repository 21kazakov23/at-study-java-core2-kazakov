package lections.lessons3;

public class Application {
    public static void main(String[] args) {
       Human human = new Human();

        System.out.println(human.age);
        System.out.println(human.name);


        Human Evkakiy = new Human(12,"ÅÂÊÀÊèé");
        System.out.println(Evkakiy.name);
        System.out.println(Evkakiy.age);
    }
}
