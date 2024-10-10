import java.util.Scanner;

public class timofiisezruskauznevrati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("blyat, tam nesmi byt nula. jdi nekam");
        } else if (a > -100 && a < 100) {
            System.out.println("cg, je to v intervalu -100 a 100");

        }
        else {
            System.out.println("blyat, nespada to do intervalu -100 a 100. jdi nekam");
        }
    }
}
