package project.homework.homework3;

/*
Даны числа от 0 до 100.
- Посчитать сумму четных и вывести на экран
- Посчитать сумму нечетных и вывести на экран
- Найти общую сумму всех чисел
 */
public class Task7 {
    public static void main(String[] args) {

        int sumOfEvenNum = 0;
        int sumOfOddNum = 0;
        int sumOfAllNum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEvenNum += i;
            } else if (i % 2 == 1) {
                sumOfOddNum += i;
            }
            sumOfAllNum = sumOfEvenNum + sumOfOddNum;

        }
        System.out.println("Sum of even numbers = " + sumOfEvenNum);
        System.out.println("Sum of odd numbers = " + sumOfOddNum);
        System.out.println("Sum of all numbers = " + sumOfAllNum);

    }
}
