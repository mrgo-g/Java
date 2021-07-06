package mainstudentstatic;

public class StudentStatic {

    private String name, surname;
    private int ects;
    static String univ = "UL";

    static {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Static block");
        }
    }

    public StudentStatic() {
    }

    public StudentStatic(String name, String surname, int ects) {
        this.name = name;
        this.surname = surname;
        this.ects = ects;
    }

    void insertStudent(String nam,
            String sur, int e) {
        name = nam;
        surname = sur;
        ects = e;
    }

    void printData() {
        System.out.println(name + " " + surname + ", ECTS: " + ects);
    }

    static void changeUniv() {
        univ = "WMiI UL";
    }
}
