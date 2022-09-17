package com.singleton.pattern;

public class SingletonWithEagerLoading {
	private static final SingletonWithEagerLoading object = new SingletonWithEagerLoading();
	
	private SingletonWithEagerLoading() {}
	
	public static SingletonWithEagerLoading getInstance() {
		return object;
	}
}
