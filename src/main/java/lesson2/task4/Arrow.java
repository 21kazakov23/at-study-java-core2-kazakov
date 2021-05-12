package lesson2.task4;

import java.util.Arrays;

public class Arrow {

    public static void main(String[] args) {

        Arrow twolines = new Arrow();

        System.out.println(twolines.combos("hello", "world"));
        System.out.println(twolines.combos("ping", "pong"));
        System.out.println(twolines.combos("qwer", "asdf"));
        System.out.println(twolines.combos("post", "get"));

    }

    String combos(String a, String b) {

        char[] oneString = a.toCharArray();
        Arrays.sort(oneString);

        String result = "";
        for (char element : oneString) {
            String meaning = String.valueOf(element);
            if (result.contains(meaning)) {
                continue;
            }
            if (b.contains(meaning)) {
                result += meaning;
            }
        }
        return result;
    }
}
