public class Student {
    private String lastName;
    private int id;

    static int studCount = 0;

    Student() {
        lastName = "";
        id = 0;
        studCount++;
    }

    Student(String arg_name, int arg_id) {
        lastName = arg_name;
        id = arg_id;
        studCount++;
    }

    Student(String arg_name) {
        lastName = arg_name;
        id = 0;
        studCount++;
    }

    Student(int arg_id) {
        lastName = "";
        id = arg_id;
        studCount++;
    }

    void echoPrint() {
        System.out.println("Last name - " + lastName + " | ID - " + id);
    }

    public static void main(String[] args) {
        Student firstConstructor = new Student();
        firstConstructor.echoPrint();

        Student secondConstructor = new Student("Мороз", 6421);
        secondConstructor.echoPrint();

        Student thirdConstructor = new Student("Новиков");
        thirdConstructor.echoPrint();

        Student fourthConstructor = new Student(9361);
        fourthConstructor.echoPrint();

        System.out.println("Total students: " + studCount);
    }
}
