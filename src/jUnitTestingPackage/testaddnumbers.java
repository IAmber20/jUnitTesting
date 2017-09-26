package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		jUnitFunction jUnit = new jUnitFunction();
		int result = jUnit.addnumbers(100, 200);
		assertEquals(300,result);
	}

}
