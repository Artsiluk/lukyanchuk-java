package project.homework.homework4;

import java.util.Scanner;

/*
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99 (1, 99 - числа пользователя)
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter last number: ");
        int last = scanner.nextInt();
        while (first <= last) {
            if (first % 2 != 0) {
                System.out.println("Odd numbers = " + first);
            }
            first++;
        }
    }
}
