import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int a= in.nextInt();
        int[] N=new int[a] ;
        for(int i = 1; i <a; ++i) {
            N[i]=in.nextInt();
        }
        int max = 0;
        int min = 9999;

        for(int i = 1; i < N.length; ++i) {
            if (N[i] > max) {
                max = N[i];
            }

            if (N[i] < min) {
                min = N[i];
            }
        }
        System.out.println("Max =" + max);
        System.out.println("minimum=" + min);
    }
}
