package patterns;

public class Patterns {

    public static void main(String[] args) {
        Pattern p1 = new OneLinePattern('#', 8);
        p1.printPattern();
        p1 = new OneLinePattern('!', 5);
        p1.printPattern();
        TwoLinePattern p2 = new TwoLinePattern('|', '&', 10);
        p2.printPattern();
        p2.changePattern('$', 'o', 4);
        p2.printPattern();
    }

}
