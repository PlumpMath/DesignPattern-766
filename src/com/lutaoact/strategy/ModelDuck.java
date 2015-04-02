package com.lutaoact.strategy;

public class ModelDuck extends Duck {

	public ModelDuck() {
		mFlyBehavior = new FlyNoWay();
		mQuackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("i'm a model duck");
	}

}
