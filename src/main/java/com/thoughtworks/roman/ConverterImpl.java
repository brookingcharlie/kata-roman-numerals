package com.thoughtworks.roman;

import java.util.Arrays;
import java.util.List;

public class ConverterImpl implements Converter {
	private final List<Rule> rules = Arrays.asList(
	    new Rule(50, "L"),
	    new Rule(40, "XL"),
	    new Rule(10, "X"),
	    new Rule(9, "IX"),
	    new Rule(5, "V"),
	    new Rule(4, "IV"),
	    new Rule(1, "I")
    );

	@Override
	public String convert(int in) throws IllegalArgumentException {
		if (in == 0) {
			throw new IllegalArgumentException();
		}
		StringBuilder out = new StringBuilder();
		int r = in;
		for (Rule rule : rules) {
			while (r >= rule.getSize()) {
				out.append(rule.getText());
				r -= rule.getSize();
			}
		}
		return out.toString();
	}
}
