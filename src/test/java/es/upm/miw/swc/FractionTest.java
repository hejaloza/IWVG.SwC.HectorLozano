package es.upm.miw.swc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.swc.Fraction;

public class FractionTest {

	private Fraction frac;

	@Before
	public void before() {
		frac = new Fraction(2, 3);
	}

	@Test
	public void testFraction() {
		frac = new Fraction();
		assertEquals(1, frac.getNumerator());
		assertEquals(1, frac.getDenominator());
	}

	@Test
	public void testFraccionNumerador() {
		assertEquals(2, frac.getNumerator());
	}

	@Test
	public void testFraccionDenominador() {
		assertEquals(3, frac.getDenominator());
	}

	@Test
	public void testDecimal() {
		assertEquals(0.66, frac.decimal(), 10e-3);
	}
	
	@Test
	public void testDenominadorAddOne() {
		assertEquals(4, frac.denominadorAddOne());
	}

}
