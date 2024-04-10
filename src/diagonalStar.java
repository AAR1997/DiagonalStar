public class diagonalStar {

    public static void main(String[] args) {

        dStar(10);
    }

    public static void dStar(int number) {

        if(number < 5) {
            System.out.println("Invalid Input");
        } else {

            for(int i = 1; i <= number; i++) {
                for(int j = 1; j <= number; j++){
                    if(i == 1 || i == number || j == 1 || j == number || i == j || (j == number - i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }
}
