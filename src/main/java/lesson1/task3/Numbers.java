package lesson1.task3;

public class Numbers {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        System.out.println(numbers.getNumbers(14));
        System.out.println(numbers.getNumbers(19));
    }

    boolean getNumbers(int number) {
        int a = number % 2;
        return a == 1;
    }


}

