package org.exercises.polymorphism.project_2;

public class Wizzard implements Attackable, Moveable {
    @Override
    public void attack() {
        System.out.println("Wizzard casts a blizzard spell");
    }

    @Override
    public void move() {
        System.out.println("Wizzard teleports away from the enemy");
    }
}
