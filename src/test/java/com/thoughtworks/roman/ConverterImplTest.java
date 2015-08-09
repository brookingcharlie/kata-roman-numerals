package com.thoughtworks.roman;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ConverterImplTest {
	@Test(expected=IllegalArgumentException.class)
	public void test0() {
		ConverterImpl converter = new ConverterImpl();
		converter.convert(0);
	}

	@Test
	public void test1() {
		ConverterImpl converter = new ConverterImpl();
		assertThat(converter.convert(1), is(equalTo("I")));
	}

	@Test
	public void test2() {
		ConverterImpl converter = new ConverterImpl();
		assertThat(converter.convert(2), is(equalTo("II")));
	}

	@Test
	public void test3() {
		ConverterImpl converter = new ConverterImpl();
		assertThat(converter.convert(3), is(equalTo("III")));
	}
}
