public class Pattern_07 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 5; i >= 1; i--) {

            // Spaces
            for (int j = n-i; j >=1; j--) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 2 * i - 1; j >=1; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
