package com.lutaoact.strategy;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("i'm flying wiht a rocket");
	}

}
