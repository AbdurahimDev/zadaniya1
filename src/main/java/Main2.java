import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("N ni kiriting:");
        n=scanner.nextInt();
        if (n<5){
            System.out.println(0);
        }else System.out.println("Javob:"+1+" ta");
    }
}
