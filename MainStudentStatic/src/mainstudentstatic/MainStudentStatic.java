package mainstudentstatic;

public class MainStudentStatic {

    public static void main(String[] args) {
        StudentStatic s1 = new StudentStatic();
        StudentStatic s2 = new StudentStatic("Al", "Be", 2);
        s1.insertStudent("Maria", "Summer", 81);
        s1.printData();
        System.out.println(s1.univ);
        System.out.println(StudentStatic.univ);
        StudentStatic.changeUniv();
        System.out.println(StudentStatic.univ);
        s2.printData();
    }

}
