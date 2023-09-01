package org.example.whitPathern;

public class HandlerReward4 extends HandlerRewards{
    @Override
    public void giveReward(Student student) {
        if (student.getGrade() == 4) {
            System.out.println(student.getName() + ", felicitaciones, un abrazo, un cuaderno nuevo y un chocolate.");
        } else {
            nextHandler.giveReward(student);
        }
    }
}
