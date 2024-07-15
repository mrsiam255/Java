import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("sum : " + sum);
    }
}
