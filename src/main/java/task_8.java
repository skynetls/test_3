import java.util.Scanner;

public class task_8 {
    public static void main(String[] args) {
        int mas[] = new int[5];
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значение mas[" + i + "]");
            mas[i] = scanner.nextInt();
            scanner.close();
        }
        System.out.println("Значение mas[] * 2: "+ mas [0]*2 +", "+ mas [1]*2 +", "+ mas [2]*2 +", "+ mas [3]*2 +", "+ mas [4]*2);


    }
}