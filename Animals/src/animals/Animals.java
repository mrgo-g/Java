
package animals;

public class Animals {

    public static void main(String[] args) {
    Animal a = new Animal(4,10);
    Animal d1 = new Dog(2,5);
    Dog d2 = new Dog();
    Cat c = new Cat();
    Animal t = new Tiger();
    Animal m = new Mouse();
    a.eat();
    a.voice();
    d1.eat();
    d1.voice();
    d2.voice();
    c.eat();
    t.voice();
    m.voice();
            }
    
}
