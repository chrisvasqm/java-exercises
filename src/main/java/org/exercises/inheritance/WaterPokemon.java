package org.exercises.inheritance;

public final class WaterPokemon extends Pokemon {

    public WaterPokemon(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + ", use bubble beam!");
    }

}
