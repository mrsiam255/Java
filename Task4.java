public class Task4 {
    public static void main(String[] args) {
        int size = 8;

        for(int row = 0; row < size; ++row) {
            for(int col = 0; col < size; ++col) {
                if ((row + col) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }

    }
}
