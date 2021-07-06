package patterns;

public class TwoLinePattern extends Pattern {

    char z1, z2;
    int n;

    public TwoLinePattern() {
    }

    public TwoLinePattern(char z1, char z2, int n) {
        this.z1 = z1;
        this.z2 = z2;
        this.n = n;
    }

    @Override
    void printPattern() {
        for (int i = 1; i <= n; i++) {
            System.out.print(z1);
        }
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            System.out.print(z2);
        }
        System.out.println("");
    }

    void changePattern(char z1, char z2, int n) {
        this.z1 = z1;
        this.z2 = z2;
        this.n = n;
    }
}
