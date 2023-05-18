package project.homework.homework3;

/*
Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */
public class Task4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            double size = i * 2.54;
            System.out.println(i + " Inch/inches = " + size + " centimeters");
        }
    }
}
