package com.thoughtworks.roman;

public class ConverterImpl implements Converter {
	@Override
	public String convert(int in) throws IllegalArgumentException {
		if (in == 1) {
			return "I";
		}
		if (in == 2) {
			return "II";
		}
		throw new IllegalArgumentException();
	}
}
