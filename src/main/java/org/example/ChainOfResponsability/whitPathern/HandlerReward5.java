package org.example.whitPathern;

public class HandlerReward5 extends HandlerRewards{
    @Override
    public void giveReward(Student student) {
        if (student.getGrade() == 5) {
            System.out.println(student.getName() + ", felicitaciones, un helado, un cuaderno nuevo, un abrazo y un chocolate.");
        } else {
            nextHandler.giveReward(student);
        }
    }
}
