package org.exercises.inheritance;

public final class WaterPokemon extends Pokemon {

    public WaterPokemon(final String name, final int level) {
        super(name, level);
    }

    @Override
    public void attack() {
        System.out.println(name + ", use bubble shower!");
    }
}
