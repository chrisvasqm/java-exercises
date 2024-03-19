package org.exercises.polymorphism.characters;

public class Wizzard extends Character implements Attackable, Moveable{
    public Wizzard() {
        super(50, 100);
    }

    @Override
    public void attack() {
        System.out.println("Wizzard casts a blizzard spell");
    }

    @Override
    public void move() {
        System.out.println("Wizzard teleports away from the enemy");
    }
}
