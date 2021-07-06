package testbank;

public class TestBank {

    public static void main(String[] args) {
        Bank b;
        b = new ABC();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        b = new KLM();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        b.welcome();
    }

}
