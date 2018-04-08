import java.security.SecureRandom;

/**
 * Created by Swagmaster on 2017-04-07.
 */
public class DiceProgram {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int frekvens1 = 0;
        int frekvens2 = 0;
        int frekvens3 = 0;
        int frekvens4 = 0;
        int frekvens5 = 0;
        int frekvens6 = 0;

        for (int roll = 1; roll <= 1000; roll++) {
            int face = 1 + randomNumbers.nextInt(6);

            switch (face) {
                case 1:
                    ++frekvens1;
                    break;
                case 2:
                    ++frekvens2;
                    break;
                case 3:
                    ++frekvens3;
                    break;
                case 4:
                    ++frekvens4;
                    break;
                case 5:
                    ++frekvens5;
                    break;
                case 6:
                    ++frekvens6;
                    break;
            }
        }
        System.out.println("Slag\tFrekvens");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frekvens1, frekvens2, frekvens3, frekvens4, frekvens5, frekvens6);
    }
}
