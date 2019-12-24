public class Main {

    public static void main(String[] args) {
        var alice = new DiffieHellman();
        var bob = new DiffieHellman();

        System.out.println("DiffieHellman");
        System.out.println("Alice chose: " + alice.getChosenNumber());
        System.out.println("Bob chose: " + bob.getChosenNumber());

        var aliceFirstStep = alice.firstStep();
        var bobFirstStep = bob.firstStep();

        System.out.println("Generated first key for Alice: " + aliceFirstStep);
        System.out.println("Generated first key for Bob: " + bobFirstStep);

        System.out.println();
        System.out.println("Generated second key for Alice: " + alice.secondStep(bobFirstStep));
        System.out.println("Generated second key for Bob: " + bob.secondStep(aliceFirstStep));

        System.out.println();
        System.out.println("Shamir");
        System.out.println("Alice chose c = " + 7 +  ", d = " + 19 + ", code = " + 10);
        var aShamir = new Shamir(7, 19, 10L);

        System.out.println("Bob chose c = " + 5 +  ", d = " + 9);
        var bShamir = new Shamir(5, 9);

        var aliceFirst = aShamir.firstStep();
        System.out.println("Alice's first: " + aliceFirst);

        var bobFirst = bShamir.firstStep(aliceFirst);
        System.out.println("Bob's first: " + bobFirst);

        var aliceSecond = aShamir.secondStep(bobFirst);
        System.out.println("Alice's second: " + aliceSecond);

        var bobSecond = bShamir.secondStep(aliceSecond);
        System.out.println("Bob's second: " + bobSecond);

        return;
    }
}
