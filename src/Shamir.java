import java.util.Optional;

public class Shamir {
    private long p = 23;
    private long c;
    private long d;
    private long code;

    Shamir(long c, long d, long code) {
        this.c = c;
        this.d = d;
        this.code = code;
    }

    Shamir(long c, long d) {
        this.c = c;
        this.d = d;
    }


    long firstStep() {
        return KeyGenerator.generate(code, c, p);
    }

    long firstStep(long base) {
        return KeyGenerator.generate(base, c, p);
    }

    long secondStep(long base) {
        return KeyGenerator.generate(base, d, p);
    }

}
