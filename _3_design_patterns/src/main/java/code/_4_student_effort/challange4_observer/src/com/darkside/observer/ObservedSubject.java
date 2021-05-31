package com.darkside.observer;

public interface ObservedSubject {

	 void register(Observer obj);

	 void unregister(Observer obj);

	 void notifyObservers(String message);
	    
}
