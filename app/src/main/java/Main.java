/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ru.llexender.se.pokebattle;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.llexender.se.pokebattle.moves.*;
import ru.llexender.se.pokebattle.pokemons.*;

public class Main {
    public static void main(String[] args) {
		Battle b = new Battle();
		Pokemon p1 = new Ursaring("Александр", 5);
		Pokemon p3 = new Espeon("Дмитрий", 15);
		Pokemon p5 = new Venonat("Константин", 25);
		Pokemon p2 = new Staryu("Дарья", 10);
		Pokemon p4 = new Venomoth("Полина", 20);
		Pokemon p6 = new Ludicolo("Лилиана", 15);
		b.addAlly(p1);
		b.addAlly(p3);
		b.addAlly(p5);
		b.addFoe(p2);
		b.addFoe(p4);
		b.addFoe(p6);
		b.go();
    }
}