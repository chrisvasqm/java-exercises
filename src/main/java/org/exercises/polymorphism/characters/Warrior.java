package org.exercises.polymorphism.characters;

public class Warrior extends Character implements Attackable, Moveable {
    public Warrior() {
        super(100, 20);
    }

    @Override
    public void attack() {
        System.out.println("Warrior swings his axe!");
    }

    @Override
    public void move() {
        System.out.println("Warrior walks towards the enemy");
    }
}
