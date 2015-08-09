package com.thoughtworks.roman;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ConverterImplTest {
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgument() {
		ConverterImpl converter = new ConverterImpl();
		converter.convert("");
	}

	@Test
	public void testI() {
		ConverterImpl converter = new ConverterImpl();
		assertThat(converter.convert("I"), is(equalTo(1)));
	}

	@Test
	public void testII() {
		ConverterImpl converter = new ConverterImpl();
		assertThat(converter.convert("II"), is(equalTo(2)));
	}
}
