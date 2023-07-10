package com.example.observer;

public class Employee {

    private Trainer trainer = new Trainer();

    public void doLearnAndWork() throws InterruptedException {
        trainer.getDesignPatterns()
                .subscribe(next -> {
                    System.out.println("employee learning/reacting to change/data/event :" + next);
                });
    }

}
