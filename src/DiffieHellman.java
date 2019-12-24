import java.util.Random;

class DiffieHellman {
    private long p = 17;
    private long generatingElement = 3;
    private long chosenNumber = getRandom();

    DiffieHellman() {
    }

    long getChosenNumber() {
        return chosenNumber;
    }

    private long generateKey(long base, long exponent) {
        return KeyGenerator.generate(base, exponent, p);
    }


    private long getRandom() {
        return 1 + Math.abs(new Random().nextInt()) % (p - 1);
    }

    long firstStep() {
        return generateKey(generatingElement, chosenNumber);
    }

    long secondStep(long pairValue) {
        return generateKey(pairValue, chosenNumber);
    }
}
