package project.homework.homework4;

import java.util.Scanner;

/*
Даны числа от 0 до 100 (числа пользователя)
 - Посчитать сумму четных и вывести на экран
 - Посчитать сумму нечетных и вывести на экран
 - Найти общую сумму всех чисел
 */
public class Task4 {
    public static void main(String[] args) {

        int sumOfEvenNum = 0;
        int sumOfOddNum = 0;
        int sumOfAllNum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter the last number: ");
        int last = scanner.nextInt();
        while (first <= last) {
            if (first % 2 == 0) {
                sumOfEvenNum += first;
            } else if (first % 2 != 0) {
                sumOfOddNum += first;
            }
            first++;
        }
        sumOfAllNum = sumOfEvenNum + sumOfOddNum;

        System.out.println("Sum of even numbers = " + sumOfEvenNum);
        System.out.println("Sum of odd numbers = " + sumOfOddNum);
        System.out.println("Sum of all numbers = " + sumOfAllNum);
    }

}

