package org.example.whitPathern;

public class HandlerReward1 extends HandlerRewards{
    @Override
    public void giveReward(Student student) {
        if (student.getGrade() == 1) {
            System.out.println(student.getName() + ", ánimo para la próxima y un abrazo.");
        } else {
            nextHandler.giveReward(student);
        }
    }
}