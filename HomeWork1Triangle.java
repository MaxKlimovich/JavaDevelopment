import java.util.Scanner;

public class HomeWork1Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enten a: ");
        int a = scanner.nextInt();
        double sum = (a*(a+1)/2);
        int n = (int) sum;
        System.out.print(n);
        scanner.close();
    }
}