package animals;

public class Dog extends Animal {

    Dog() {
    }

    Dog(int age, int weight) {
        super(age, weight);
    }

    @Override
    void eat() {
        System.out.println("I like dry food.");
    }

    @Override
    void voice() {
        System.out.println("I am barking sometimes.");
    }

}
