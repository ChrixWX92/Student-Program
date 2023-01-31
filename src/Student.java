public class Student {

    private final String name;
    private Grade grade;
    private final int group;
    private final String secretNickName = "MySecretNickName";

    public Student(String name, Grade grade, int group) {

        this.name = name;
        this.grade = grade;
        if (group < 1 || group > 5) throw new IllegalArgumentException("Group number must be an integer between 1 and 5.");
        this.group = group;

    }


    public void upgrade() {if (this.grade != Grade.A) this.grade = Grade.values()[this.grade.ordinal()-1];}
    public void downgrade() {if (this.grade != Grade.F) this.grade = Grade.values()[this.grade.ordinal()+1];}

    public String getName() {return name;}
    public Grade getGrade() {return grade;}

    public enum Grade {A, B, C, D, E, F}

}
