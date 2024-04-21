package org.exercises.inheritance;

public abstract class Pokemon {
    protected String name;
    protected int level;

    public Pokemon(String name) {
        this.name = name;
        this.level = 1;
    }

    public void levelUp() {
        level++;
    }

    public abstract void attack();

}
