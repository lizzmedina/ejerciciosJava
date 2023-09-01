package org.example.whitPathern;

public class HandlerReward3  extends HandlerRewards{
    @Override
    public void giveReward(Student student) {
        if (student.getGrade() == 3) {
            System.out.println(student.getName() + ", ánimo, un abrazo y un chocolate.");
        } else {
            nextHandler.giveReward(student);
        }
    }
}
