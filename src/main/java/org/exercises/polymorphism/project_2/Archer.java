package org.exercises.polymorphism.project_2;

public class Archer implements Attackable, Moveable {
    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow");
    }

    @Override
    public void move() {
        System.out.println("Archer runs away from the enemy");
    }
}
