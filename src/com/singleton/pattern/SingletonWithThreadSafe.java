package com.singleton.pattern;

public class SingletonWithThreadSafe {
	
	private static SingletonWithThreadSafe object =null;
	
	private SingletonWithThreadSafe() {}
	/**
	 * This work slow as many in race condition every thread has to wait
	 */
	
	/*public static synchronized SingletonWithThreadSafe getInstanceSlow() {
		if(object == null) object = new SingletonWithThreadSafe();
		return object;
	} */
	
	/**
	 * This is double checking fast thread safe locking
	 */
	public static SingletonWithThreadSafe getInstance() {
		if(object == null) {
			synchronized(SingletonWithThreadSafe.class) {
				if(object == null) {
					object = new SingletonWithThreadSafe();
				}
			}
		}
		return object;
	}
}
