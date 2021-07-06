package animals;

public class Cat extends Animal {

    Cat() {
    }

    Cat(int age, int weight) {
        super(age, weight);
    }

    @Override
    void eat() {
        System.out.println("I like milk.");
    }

    @Override
    void voice() {
        System.out.println("I am meowing sometimes.");
    }
}
