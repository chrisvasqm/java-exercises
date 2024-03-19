package org.exercises.polymorphism.characters;

public abstract class Character {
    protected int health;
    protected int mana;

    public Character(int health, int mana) {
        this.health = health;
        this.mana = mana;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }
}
