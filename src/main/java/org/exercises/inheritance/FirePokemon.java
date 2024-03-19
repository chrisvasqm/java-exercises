package org.exercises.inheritance;

public final class FirePokemon extends Pokemon {

    public FirePokemon(String name, int level) {
        super(name, level);
    }

    @Override
    public void attack() {
        System.out.println(name + ", use fireball!");
    }
}
