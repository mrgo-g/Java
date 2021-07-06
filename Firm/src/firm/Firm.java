package firm;

public class Firm {

    public static void main(String[] args) {
        System.out.println("Our company " + Employee.company); //printing static field
        Employee em1 = new Employee(); //using the default constructor
        Employee em2 = new Employee("Anna", "Fox", 3000);
        Employee b1 = new Boss(1000, "Maria", "Summer", 5000);
        Boss b2 = new Boss(500, "Adam", "Winter", 4500);
        Employee oem = new OfficeEmployee("A102", "Mark", "Looman", 2000);
        Accountant ac = new Accountant( 500, "D401", "Teresa", "Cool", 2500);
        em1.printData();
        em2.printData();
        b1.printData(); //method from Boss
//      System.out.println("Bonus of the boss b1" + b1.getBonus()); //error - b1 declared as Emploee, method getBonus in Boss
        b2.printData();
        System.out.println("Bonus of the boss b2: " + b2.getBonus()); //ok, b2 declared as Boss
        oem.printData();
        ac.printData();
    }

}
