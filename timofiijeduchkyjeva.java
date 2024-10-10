import java.util.Scanner;

public class timofiijeduchkyjeva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day){

            case 5:
                System.out.println("Je sobota");
                break;
            case 6:
                System.out.println("Je neděle");
                break;
            default:
                System.out.println("Je pracovní týden");
                break;

        }

    }
}
