package org.example.whitPathern;

public class Teacher {
    private HandlerRewards handlerRewards;
    public Teacher() {
        HandlerRewards handler1 = new HandlerReward1();
        HandlerRewards handler2 = new HandlerReward2();
        HandlerRewards handler3 = new HandlerReward3();
        HandlerRewards handler4 = new HandlerReward4();
        HandlerRewards handler5 = new HandlerReward5();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        handler3.setNextHandler(handler4);
        handler4.setNextHandler(handler5);

        handlerRewards = handler1;
    }
    public void giveReward(Student student) {
        handlerRewards.giveReward(student);
    }
}