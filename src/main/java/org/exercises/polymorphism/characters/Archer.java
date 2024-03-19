package org.exercises.polymorphism.characters;

public class Archer extends Character implements Attackable, Moveable{
    public Archer() {
        super(80, 50);
    }

    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow with his bow");
    }

    @Override
    public void move() {
        System.out.println("Archer sprints towards the enemy");
    }
}
