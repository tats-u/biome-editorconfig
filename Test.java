import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;

class Test {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        final var random = SecureRandom.getInstanceStrong();
        if (random.nextBoolean()) {
            System.out.println("You are lucky!");
        } else {
            System.out.println("Too bad!");
        }
    }
}
