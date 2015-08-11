package com.thoughtworks.roman;

public class ConverterImpl implements Converter {
	@Override
	public String convert(int in) throws IllegalArgumentException {
		if (in == 0) {
			throw new IllegalArgumentException();
		}
		StringBuilder out = new StringBuilder();
		int r = in;
		while (r >= 50) {
			out.append("L");
			r -= 50;
		}
		while (r >= 40) {
			out.append("XL");
			r -= 40;
		}
		while (r >= 10) {
			out.append("X");
			r -= 10;
		}
		while (r >= 9) {
			out.append("IX");
			r -= 9;
		}
		while (r >= 5) {
			out.append("V");
			r -= 5;
		}
		while (r >= 4) {
			out.append("IV");
			r -= 4;
		}
		while (r >= 1) {
			out.append("I");
			r -= 1;
		}
		return out.toString();
	}
}
