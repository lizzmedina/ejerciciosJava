package org.example.whitPathern;

public class MainWithPathern {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student1 = new Student("Juan", 3);
        Student student2 = new Student("Pedro", 4);
        Student student3 = new Student("Maria", 1);
        Student student4 = new Student("Patricia", 5);

        teacher.giveReward(student1);
        teacher.giveReward(student2);
        teacher.giveReward(student3);
        teacher.giveReward(student4);
    }
}
