package project.homework.homework3;
/*
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Task3 {
    public static void main(String[] args) {

        int a = 4;
        int b = 3;
        int result = 0;

        for (int i = 1; i <= b ; i++) {
            result += a;
        }
        System.out.println("Result = " + result);
    }
}
