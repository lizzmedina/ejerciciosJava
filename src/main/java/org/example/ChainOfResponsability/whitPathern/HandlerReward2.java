package org.example.whitPathern;

public class HandlerReward2 extends HandlerRewards{

    @Override
    public void giveReward(Student student) {
        if (student.getGrade() == 2) {
            System.out.println(student.getName() + ", ánimo para la próxima, un abrazo y un caramelo.");
        } else {
            nextHandler.giveReward(student);
        }
    }
}
