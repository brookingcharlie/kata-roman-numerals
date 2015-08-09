package com.thoughtworks.roman;

public class ConverterImpl implements Converter {
	@Override
	public int convert(String in) throws IllegalArgumentException {
		if (in.equals("I")) {
			return 1;
		}
		if (in.equals("II")) {
			return 2;
		}
		throw new IllegalArgumentException();
	}
}
