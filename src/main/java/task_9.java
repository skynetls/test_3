import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        int table[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите значение table[" + i + "][" + j + "]");
                table[i][j] = scanner.nextInt();
                scanner.close();
            }

        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Значение table["+ i +"][" + j + "]: " + table[i][j]*3);
            }
        }
    }
}