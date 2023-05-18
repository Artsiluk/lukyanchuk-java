package project.homework.homework2;

/*
Написать программу, которая выводит на экран сумму, произведение,  остаток от деления,
результат сложения двух чисел (целых и вещественных)
 */
public class Task1 {
    public static void main(String[] args) {

        int numInt1 = 23;
        int numInt2 = 42;
        float numFloat1 = 4.8f;
        float numFloat2 = 15.16f;

        float additionFloat = numFloat1 + numFloat2;
        int addition = numInt1 + numInt2;

        System.out.println("Addition float = " + additionFloat);
        System.out.println("Addition = " + addition + '\n' + "***");

        int subtraction = numInt2 - numInt1;
        float subtractionFloat = numFloat2 - numFloat1;

        System.out.println("Subtraction = " + subtraction);
        System.out.println("Subtraction float = " + subtractionFloat + '\n' + "***");

        int multiplication = numInt1 * numInt2;
        Float multiplicationFloat = numFloat1 * numFloat2;

        System.out.println("Multiplication = " + multiplication);
        System.out.println("Multiplication float = " + multiplicationFloat + '\n' + "***");

        int division = numInt2 / numInt1;
        float divisionFloat = numFloat2 / numFloat1;

        System.out.println("Division = " + division);
        System.out.println("Division float = " + divisionFloat + '\n' + "***");

        int remainder = numInt2 % numInt1;
        float remainderFloat = numFloat2 % numFloat1;

        System.out.println("Remainder = " + remainder);
        System.out.println("Remainder float = " + remainderFloat);

    }
}
