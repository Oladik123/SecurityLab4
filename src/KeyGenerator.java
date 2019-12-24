public class KeyGenerator {

    public static long generate(long base, long exponent, long p){
        long result = 1;
        while (exponent != 0) {
            if (exponent % 2 == 0) {
                exponent /= 2;
                base *= base % p;
            } else {
                exponent--;
                result *= base % p;
            }
        }
        return result % p;
    }
}
