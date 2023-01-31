

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Jimmy", Student.Grade.C, 4);
        System.out.println(student.getName());
        System.out.println(student.getGrade().toString());
        student.downgrade();
        System.out.println(student.getGrade().toString());
        student.upgrade();
        System.out.println(student.getGrade().toString());

    }

}
