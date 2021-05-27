package com.darkside.observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject {
	private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer obj) {
    	observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
       observers.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
    	for (Observer iterator: observers) {
    		iterator.update(message);
    	}
    }

    public void teach(String topic) {
    	for (Observer iterator: observers) {
    		iterator.update(topic);
    	}
    }
}