package com.thoughtworks.roman;

import org.junit.Test;

public class InvalidConverterTests {
	@Test(expected=IllegalArgumentException.class)
	public void test0() {
		Converter.convert(0);
	}
}
