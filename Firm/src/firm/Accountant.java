
package firm;

public class Accountant extends OfficeEmployee{
 float bonus;   

    Accountant(float bonus, String room, String name, String surname, float salary) { //constructor
        super(room, name, surname, salary);
        this.bonus = bonus;
    }
 @Override
void printData(){
    System.out.println(name + " " + surname + ", room " + room + ", bonus: " + bonus);
}
    
}
