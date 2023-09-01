package org.example.withOutPathern;

public class MainWithOutP {
    public static void main(String[] args) {
        Student student1 = new Student("Juan", 3);
        Student student2 = new Student("Maria", 1);
        Student student3 = new Student("Pedro", 5);
        student1.giveReward();
        student2.giveReward();
        student3.giveReward();
    }
}
