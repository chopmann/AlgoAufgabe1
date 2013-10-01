package de.ostfalia.algo.aufgabe1.test;

import de.ostfalia.algo.aufgabe1.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumTest {

	@Test
	public void testBC() {
		Aufgabe1 gladiator = new Aufgabe1();
		gladiator.maximum("Materialien/BC.txt");
		assertEquals(9998, gladiator.getMax());
	}
	@Test
	public void testWC() {
		Aufgabe1 gladiator = new Aufgabe1();
		gladiator.maximum("Materialien/WC.txt");
		assertEquals(9972, gladiator.getMax());
	}
	@Test
	public void testAC() {
		Aufgabe1 gladiator = new Aufgabe1();
		gladiator.maximum("Materialien/AC.txt");
		assertEquals(9956, gladiator.getMax());
	}

}
