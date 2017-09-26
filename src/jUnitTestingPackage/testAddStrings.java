package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jUnitstring = new jUnitFunction();
		String result = jUnitstring.addStrings("capstone","project");
		assertEquals("capstoneproject",result);
	}

}
