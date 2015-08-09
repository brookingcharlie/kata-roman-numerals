package com.thoughtworks.roman;

public class ConverterImpl implements Converter {
	@Override
	public String convert(int in) throws IllegalArgumentException {
		if (in == 0) {
			throw new IllegalArgumentException();
		}
		StringBuilder out = new StringBuilder();
		int r = in;
		if (r >= 10) {
			out.append("X");
			r -= 10;
		}
		if (r == 9) {
			out.append("IX");
			r -= 9;
		}
		if (r >= 5) {
			out.append("V");
			r -= 5;
		}
		if (r == 4) {
			out.append("IV");
			r -= 4;
		}
		while (r > 0) {
			out.append("I");
			r -= 1;
		}
		return out.toString();
	}
}
