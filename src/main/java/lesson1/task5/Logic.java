package lesson1.task5;

public class Logic {
    public static void main(String[] args) {
        Logic logic = new Logic();
        System.out.println(logic.first(false, false) + " " + logic.second(false, false));
        System.out.println(logic.first(false, true)+ " " + logic.second(false, true));;
        System.out.println(logic.first(true, false)+ " " + logic.second(true, false));;
        System.out.println(logic.first(true, true)+ " " + logic.second(true, true));;


    }

    boolean first(boolean a, boolean b) {
        return !(a || b);
    }

    boolean second(boolean a, boolean b) {
        return !a && !b;
    }

}
