package animals;

public class Mouse extends Animal {

    Mouse() {
    }

    Mouse(int age, int weight) {
        super(age, weight);
    }

    @Override
    void eat() {
        System.out.println("I like cheese.");
    }

    @Override
    void voice() {
        System.out.println("I am squeaking sometimes.");
    }
}
