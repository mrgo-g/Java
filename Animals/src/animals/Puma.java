package animals;

public class Puma extends Cat {

    Puma() {
    }

    Puma(int age, int weight) {
        super(age, weight);
    }

    @Override
    void eat() {
        System.out.println("I like meat.");
    }
}
