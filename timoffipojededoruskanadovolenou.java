import java.util.Random;


public class timoffipojededoruskanadovolenou {
    public static void main(String[] args) {
        Random rng = new Random();
        int prve = rng.nextInt(1, 7);
        int druhe = rng.nextInt(1, 7);
        if (prve + druhe > 9 ){
            System.out.println("vzhrals");
        } else if (prve==druhe) {
            System.out.println("vzhrals, padla 2 stejna cisla");

        }
        else {
            System.out.println("prohrals");
        }
        System.out.println("cisla byla:");
        System.out.println(prve);
        System.out.println(druhe);
    }
}
