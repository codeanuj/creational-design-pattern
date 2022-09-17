package com.singleton.pattern;

public class SingletonWithLazyLoading {
	
	private static SingletonWithLazyLoading object = null;
	
	private SingletonWithLazyLoading() {}
	
	public static SingletonWithLazyLoading getInstance() {
		if(object == null) object = new SingletonWithLazyLoading();
		return object;
	}

}
