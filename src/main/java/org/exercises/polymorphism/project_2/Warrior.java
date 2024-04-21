package org.exercises.polymorphism.project_2;

public class Warrior implements Attackable, Moveable {
    @Override
    public void attack() {
        System.out.println("Warrior swings his axe");
    }

    @Override
    public void move() {
        System.out.println("Warrior walks towards the enemy");
    }
}
