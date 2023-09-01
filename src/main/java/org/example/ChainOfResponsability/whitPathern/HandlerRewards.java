package org.example.whitPathern;

public abstract class HandlerRewards {
    protected HandlerRewards nextHandler;

    public void setNextHandler(HandlerRewards nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void giveReward(Student student);
}
