package lections.lesson1;

/**
 * �����-�����������
 */

public class Calculator {


    // ������������ �����������

    /*
        �������������
        �����������
     */

    /**
     * ���������� ����� ���� �����
     *
     * @param first  - ������ �����
     * @param second - ������ �����
     * @return ����� ����� first � second
     */
    int sum(int first, int second) {
        return first + second;
    }

    /**
     * ���������� �������� ���� �����
     *
     * @param first  - �����������
     * @param second - ����������
     * @return - ��������.
     */
    int substract(int first, int second) {
        return first - second;
    }

    /**
     * ���������� ������������ ���� �����
     *
     * @param first  - ��������
     * @param second - ���������
     * @return ������������t
     */

    int multiply(int first, int second) {
        return first * second;
    }

    /**
     * ���������� �������� ���� �����
     *
     * @param first  - �������
     * @param second - ��������
     * @return �������
     */
    double divide(int first, int second) {
        return 1.0 * first / second;
    }

    /**
     * �������� �� ����� ��������
     *
     * @param number - ����������� �����
     * @return - ���������
     */
    boolean isOdd(int number) {
        return number % 2 == 1;
    }

}
