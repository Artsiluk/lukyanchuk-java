package project.homework.homework3;

/*
Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */
public class Task5 {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            //а можно просто i+=2
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
