package com.luban.observer;

import java.util.Observable;

public class Movie4JDK extends Observable {

	public void move(){
		setChanged();
		notifyObservers();
	}
}
