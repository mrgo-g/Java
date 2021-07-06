package testbank;

abstract class Bank {

    Bank() { //constructor
        System.out.println("Bank is created");
    }

    void welcome() {  //non-abstract method
        System.out.println("Welcome to Bank");
    }

    abstract double getRateOfInterest(); //abstract method
}
