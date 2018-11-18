import java.util.Scanner;

public class task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте размер массива: ");
        int x = scanner.nextInt();
        int [] mas = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Введите значение mas[" + i + "]");
            mas[i] = scanner.nextInt();
        }
        for (int j = 0; j < x; j++) {
            System.out.println("mas[" + j + "] * 2 = " + mas [j] * 2);
        }

        scanner.close();
    }
}