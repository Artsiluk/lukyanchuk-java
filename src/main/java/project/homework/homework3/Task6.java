package project.homework.homework3;

/*
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */
//+
public class Task6 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
