package firm;

class Employee {

    String name, surname; //fields
    float salary;  //field
    static String company = "Company XYZ";  //static field

    Employee() {  //default constructor
    }

    Employee(String name, String surname, float salary) { //constructor
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    void printData() {  //method
        System.out.println(name + " " + surname + ", salary: " + salary);
    }
}
