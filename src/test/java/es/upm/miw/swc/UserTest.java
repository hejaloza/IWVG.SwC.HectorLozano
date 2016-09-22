package es.upm.miw.swc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.swc.User;

public class UserTest {

	private User usuario;

	@Before
	public void before() {
		usuario = new User(1, "Hector", "Lozano");
	}

	@Test
	public void testUser() {
		assertEquals(1, usuario.getNumber());
		assertEquals("Hector", usuario.getName());
		assertEquals("Lozano", usuario.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Hector Lozano", usuario.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("H.", usuario.initials());
	}

	@Test
	public void testGetNumber() {
		assertEquals(1, usuario.getNumber());
	}

	@Test
	public void testGetName() {
		assertEquals("Hector", usuario.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Lozano", usuario.getFamilyName());
	}

}
