package animals;

public class Puppy extends Dog {

    Puppy() {
    }

    Puppy(int age, int weight) {
        super(age, weight);
    }

    @Override
    void voice() {
        System.out.println("I am whining sometimes.");
    }
}
