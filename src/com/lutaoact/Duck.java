package com.lutaoact;

public abstract class Duck {
	FlyBehavior mFlyBehavior;
	QuackBehavior mQuackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly() {
		mFlyBehavior.fly();
	}
	public void performQuack() {
		mQuackBehavior.quack();
	}
	public void swim() {
		System.out.println("all ducks float, event decoys");
	}
}
