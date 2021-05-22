package lesson2.task1;

public class BestDay {


    public static void main(String[] args) {
        String[] friday = {"Пятница", "это", "лудший", "день", "недели"};

        BestDay test = new BestDay();
        test.fridayFor(friday);
        test.fridayForeach(friday);
        test.fridayWhile(friday);


    }

    void fridayFor(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != (array.length - 1)) {
                System.out.print(" ");
            }
        }
        System.out.print(".");
        System.out.println("");
    }

    void fridayForeach(String[] array) {
        for (String i : array) {
            System.out.print(i);
            int a = 0;
            if (a != (array.length - 1)) {
                System.out.print(" ");
            }
            a++;
        }
        System.out.print(".");
        System.out.println("");
    }

    void fridayWhile(String[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i]);
            if (i != (array.length - 1)) {
                System.out.print(" ");
            }
            i++;
        }
        System.out.print(".");
        System.out.println("");
    }

}


