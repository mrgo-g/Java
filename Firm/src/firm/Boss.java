package firm;

class Boss extends Employee {

    private float bonus;

    Boss(float bonus, String name, String surname, float salary) { //constructor
        super(name, surname, salary);
        this.bonus = bonus;
    }

    float getBonus() { //method
        return bonus;
    }

    @Override
    void printData() {
        System.out.println("Boss: " + name + " " + surname + ", bonus: " + bonus);
    }
}
