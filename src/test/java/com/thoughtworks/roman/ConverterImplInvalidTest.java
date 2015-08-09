package com.thoughtworks.roman;

import org.junit.Test;

public class ConverterImplInvalidTest {
	@Test(expected=IllegalArgumentException.class)
	public void test0() {
		ConverterImpl converter = new ConverterImpl();
		converter.convert(0);
	}
}
