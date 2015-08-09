package com.thoughtworks.roman;

import org.junit.Test;

public class ConverterImplTest {
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgument() {
		ConverterImpl converter = new ConverterImpl();
		converter.convert("");
	}
}
