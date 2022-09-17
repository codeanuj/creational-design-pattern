package com.singleton.pattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonWithEagerLoading se1 = SingletonWithEagerLoading.getInstance();
		SingletonWithEagerLoading se2 = SingletonWithEagerLoading.getInstance();
		
		if(se1==se2)System.out.println("Yes");
		
		SingletonWithLazyLoading sl1 = SingletonWithLazyLoading.getInstance();
		SingletonWithLazyLoading sl2 = SingletonWithLazyLoading.getInstance();
		
		if(sl1==sl2)System.out.println("Yes");
		
		SingletonWithThreadSafe st1 = SingletonWithThreadSafe.getInstance();
		SingletonWithThreadSafe st2 = SingletonWithThreadSafe.getInstance();
		
		if(st1==st2)System.out.println("Yes");
		
		SingletonWithEnum sen1 = SingletonWithEnum.OBJECT;
		SingletonWithEnum sen2 = SingletonWithEnum.OBJECT;
		
		if(sen1==sen2)System.out.println("Yes");
		
	}

}
