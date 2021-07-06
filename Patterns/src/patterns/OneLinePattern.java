package patterns;

public class OneLinePattern extends Pattern {

    char z;
    int n;

    public OneLinePattern() {
    }

    public OneLinePattern(char z, int n) {
        this.z = z;
        this.n = n;
    }

    @Override
    void printPattern() {
        for (int i = 1; i <= n; i++) {
            System.out.print(z);
        }
        System.out.println("");
    }
}
