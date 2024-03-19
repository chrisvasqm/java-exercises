package org.exercises.inheritance;

public class ElectricPokemon  extends Pokemon{
    public ElectricPokemon(String name, int level) {
        super(name, level);
    }

    @Override
    public void attack() {
        System.out.println(name + ", use thunder attack!");
    }
}
