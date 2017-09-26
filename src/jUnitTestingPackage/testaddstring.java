package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstring {

	@Test
	public void test() {
	
		jUnitFunction jUnitstring = new jUnitFunction();
		String result = jUnitstring.addstring("capstone", "project");
		assertEquals("capstoneproject",result);
	}

}
