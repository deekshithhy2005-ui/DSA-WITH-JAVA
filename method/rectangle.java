public class rectangle {
    public static void main(String[] args) {
         for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                // Check if it's a border position
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
    
