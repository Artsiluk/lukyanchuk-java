package lesson1;

public class WhileExample {
    public static void main(String[] args) {

        int sumOfOddNumbers = 0;
        int i = 1;
        while (i <= 100) {

            if (i % 2 == 1) {
                sumOfOddNumbers += i;
            }
            i++;
        }
        System.out.println(sumOfOddNumbers);
    }
}
