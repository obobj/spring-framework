package com.luban.observer;

import java.util.Observable;
import java.util.Observer;

public class Master4JDK implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("observer---");
	}
}
