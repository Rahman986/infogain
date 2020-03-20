package com.infogain.threads;

public class DeadLock {
	public static void main(String[] args) {
		
		
	}
	public void m1() {
		synchronized(String.class) {
			System.out.println("Acquire lock for String.class Object");
		}
		synchronized(Integer.class) {
			System.out.println("Acquire lock for Integer.class Object");
		}
		public void m2() {
			synchronized(Integer.class) {
				System.out.println("Acquire lock for Integer Object");
			}
			synchronized(String.class) {
				System.out.println("Acquired lock for String Object");
			}
		}}

}
