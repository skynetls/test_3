import java.util.Scanner;

public class task_8 {
    public static void main(String[] args) {
        int mas[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение mas[" + i + "]");
            mas[i] = scanner.nextInt();
        }
        System.out.println("Значение mas[] * 2: "+ mas [0]*2 +", "+ mas [1]*2 +", "+ mas [2]*2 +", "+ mas [3]*2 +", "+ mas [4]*2);

        scanner.close();
    }
}