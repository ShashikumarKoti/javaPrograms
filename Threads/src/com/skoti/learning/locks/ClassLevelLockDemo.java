package com.skoti.learning.locks;

public class ClassLevelLockDemo {

	public static void main(String[] args) {
		ClassLevelLockTest test1 = new ClassLevelLockTest();
	      Thread t1 = new Thread(test1);
	      Thread t2 = new Thread(test1);
	      ClassLevelLockTest test2 = new ClassLevelLockTest();
	      Thread t3 = new Thread(test2);
	      t1.setName("t1");
	      t2.setName("t2");
	      t3.setName("t3");
	      t1.start();
	      t2.start();
	      t3.start();
	}
}

class ClassLevelLockTest implements Runnable {
	@Override
	public void run() {
	//	classLock();
		m1();
	}

	private void m1() {
		synchronized (this) {
			System.out.println("Synchronized block " + Thread.currentThread().getName() + " start in instance block");
			System.out.println("Synchronized block " + Thread.currentThread().getName() + " end in instance block");
		}
	}

	public void classLock() {
		System.out.println(Thread.currentThread().getName());
		synchronized (ClassLevelLockTest.class) {
			System.out.println("Synchronized block " + Thread.currentThread().getName() + " start");
			System.out.println("Synchronized block " + Thread.currentThread().getName() + " end");
		}
	}
}