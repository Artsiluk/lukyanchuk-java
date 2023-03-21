package lesson1;

public class For {
    public static void main(String[] args) {

        int sumOfOddNumbers = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Четное = " + i);
            } else {
                sumOfOddNumbers += i;
                System.out.println("Нечетное = " + i);
            }
        }
    }
}
