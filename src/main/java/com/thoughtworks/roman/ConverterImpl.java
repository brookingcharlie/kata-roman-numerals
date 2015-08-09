package com.thoughtworks.roman;

public class ConverterImpl implements Converter {
	@Override
	public String convert(int in) throws IllegalArgumentException {
		if (in == 0) {
			throw new IllegalArgumentException();
		}
		StringBuilder out = new StringBuilder();
		if (in == 5) {
			return "V";
		}
		if (in == 4) {
			return "IV";
		}
		for (int i = in; i > 0; i--) {
			out.append("I");
		}
		return out.toString();
	}
}
