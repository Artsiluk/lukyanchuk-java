package project.homework.homework4;

import java.util.Scanner;

/*
Напишите программу вывода всех четных чисел от 2 до 100 включительно (2, 100 - числа пользователя)
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter last number: ");
        int last = scanner.nextInt();
        while (first <= last) {
            if (first % 2 == 0) {
                System.out.println("Even numbers = " + first);
            }
            first++;

        }
    }
}
