package com.lutaoact.strategy;

public abstract class Duck {
	FlyBehavior mFlyBehavior;
	QuackBehavior mQuackBehavior;
	
	public Duck() {
		
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		mFlyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		mQuackBehavior = qb;
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
