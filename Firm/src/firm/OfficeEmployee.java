package firm;

public class OfficeEmployee extends Employee {

    String room;

    OfficeEmployee(String room, String name, String surname, float salary) { //constructor
        super(name, surname, salary);
        this.room = room;
    }

    @Override
    void printData() {
        System.out.println(name + " " + surname + ", room " + room);
    }

}
