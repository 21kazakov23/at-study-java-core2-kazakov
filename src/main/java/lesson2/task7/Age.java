package lesson2.task7;

public class Age {
    public static void main(String[] args) {

        Age age = new Age();
        System.out.println(age.ageCandidate(32));
        System.out.println(age.ageCandidate(52));
        System.out.println(age.ageCandidate(66));
        System.out.println(age.ageCandidate(82));
        System.out.println(age.ageCandidate(25));
        System.out.println(age.ageCandidate(44));
        System.out.println(age.ageCandidate(60));
        System.out.println(age.ageCandidate(75));
        System.out.println(age.ageCandidate(22));
        System.out.println(age.ageCandidate(119));
    }

    String ageCandidate(int a) {
        String result = "";
        if (a >= 25 && a < 44) {
            result = "������� �������";
        }
        if (a >= 44 && a < 60) {
            result = "������� �������";
        }
        if (a >= 60 && a < 75) {
            result = "������� �������";
        }
        if (a >= 75 && a < 90) {
            result = "���������� �������";
        }
        if (a < 25 || a > 90) {
            result = "����������� �������";
        }
        return result;
    }
}
