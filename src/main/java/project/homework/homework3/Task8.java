package project.homework.homework3;

/*
Нарисуйте оставшиеся 2 треугольника.
Опционально: можете нарисовать все 4 фигуры, чтобы у вас получился ромб
   *  (1)
  **
 ***
****

****  (2)
 ***
  **
   *
 */
public class Task8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            for (int j = 1; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = 4; j >= i; j--) {
                System.out.print('*');
            }
            for (int j = 3; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

