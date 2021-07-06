package animals;

public class Tiger extends Cat {

    Tiger() {
    }

    Tiger(int age, int weight) {
        super(age, weight);
    }

    @Override
    void voice() {
        System.out.println("I am roaring sometimes.");
    }
}
