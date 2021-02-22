package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetLength implements ArrayLength {
    @Override
    public int getLength() {
        Scanner scan = new Scanner(System.in);
        int length = 0;
        try {
            System.out.println("Введіть кількість елементів: ");
            length = scan.nextInt();
            while (length < 0) {
                System.out.println("Введіть значення більше за 0: ");
                length = scan.nextInt();
            }
        } catch (InputMismatchException a) {
            System.out.println("Введені неправильні дані");
            System.exit(0);

        }
        return length;
    }
}