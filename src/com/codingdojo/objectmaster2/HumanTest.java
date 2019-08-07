package com.codingdojo.objectmaster2;

public class HumanTest {

	public static void main(String[] args) {
		Human testHuman1 = new Human("John");
		Human testHuman2 = new Human("Johnny");
		Human testHuman3 = new Human("Lanny");
		Wizard testWizard1 = new Wizard("BlackMage");
		Wizard testWizard2 = new Wizard("WhiteMage");
		Wizard testWizard3 = new Wizard("Paladin");
		Ninja testNinja1 = new Ninja("Naruto");
		Ninja testNinja2 = new Ninja("Sasuke");
		Ninja testNinja3 = new Ninja("Sakauri");
		Samurai testSamurai1 = new Samurai("Jin");
		Samurai testSamurai2 = new Samurai("Ryu");
		Samurai testSamurai3 = new Samurai("Dex");		
		
		testHuman1.attack(testSamurai3);
		testWizard1.fireball(testNinja2);
		testNinja2.steal(testHuman2);
		testSamurai1.attack(testHuman3);
		testWizard2.heal(testNinja2);
		testWizard3.fireball(testNinja3);
		testSamurai3.deathBlow(testNinja1);
		testSamurai2.meditate();
		testNinja1.runAway();
		testSamurai3.howMany();		
	}
}