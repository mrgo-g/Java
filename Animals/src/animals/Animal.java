package animals;

public class Animal {

    int age, weight;

    Animal() {
    }

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println("I eat every day.");
    }

    void voice() {
        System.out.println("I like my voice.");
    }
}
