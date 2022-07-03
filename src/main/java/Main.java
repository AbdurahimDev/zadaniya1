import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int step;
        int [][] mass = new int[7][7];

        System.out.println("Massiv elementlarini kiriting:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                mass[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (mass[i][j] == 1) {
                    step=(Math.abs(3-i)+Math.abs(3-j));
                    System.out.println(step);
                }
            }
        }
    }
}
