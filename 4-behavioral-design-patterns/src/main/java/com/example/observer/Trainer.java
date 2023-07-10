package com.example.observer;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.Subject;

import java.util.concurrent.TimeUnit;

public class Trainer {

    public Observable<Integer> getDesignPatterns() throws InterruptedException {
        return Observable.create(emitter -> {
            int designPattern = 0;
            while (!emitter.isDisposed()) {
                TimeUnit.SECONDS.sleep(2);
                designPattern++;
                System.out.println("Trainer propagating change/data/event into stream");
                emitter.onNext(designPattern); // push
            }
        });
    }

}
