package project.homework.homework4;

/*
Вычислить: 1+2+4+8+...+256
 */
public class Task1 {
    public static void main(String[] args) {

        int sum = 1;
        int i = 2;
        while (i <= 256) {
            sum += i;
            i *= 2;
        }
        System.out.println("Sum = " + sum);
    }
}
