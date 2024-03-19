package org.exercises.inheritance;

public abstract class Pokemon {
    protected String name;
    protected int level;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        level++;
    }

    public abstract void attack();
}
