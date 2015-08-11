package com.thoughtworks.roman;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ConverterImplValidTest {
	@Parameter(0)
	public int in;

	@Parameter(1)
	public String expected;

	@Parameters(name = "{0} returns {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1, "I"},
			{2, "II"},
			{3, "III"},
			{4, "IV"},
			{5, "V"},
			{8, "VIII"},
			{9, "IX"},
			{10, "X"},
			{30, "XXX"},
			{40, "XL"},
			{42, "XLII"},
			{50, "L"},
			{70, "LXX"},
			{94, "XCIV"},
			{369, "CCCLXIX"},
			{448, "CDXLVIII"},
			{1998, "MCMXCVIII"},
			{2751, "MMDCCLI"}
		});
	}

	@Test
	public void test() {
		ConverterImpl converter = new ConverterImpl();
		assertThat(converter.convert(in), is(equalTo(expected)));
	}
}
