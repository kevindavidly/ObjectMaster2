package com.codingdojo.objectmaster2;

public class Ninja extends Human{
	//Constructor
	public Ninja() {
		this.stealth = 10;
	}
	public Ninja(String name) {
		this.stealth = 10;
		this.name = name;
	}

	//Methods
	public void steal(Human human) {
		human.setHealth(human.getHealth()+stealth);
		this.setHealth(this.getHealth()+stealth);
		System.out.println("Snatch!");
		System.out.println("(" + human.getName() + " was Ninjed " + stealth + " points of damage!)");
	}
	public void runAway() {
		this.setHealth(-10);
	}
}

