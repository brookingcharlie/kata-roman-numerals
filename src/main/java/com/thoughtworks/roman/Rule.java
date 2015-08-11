package com.thoughtworks.roman;

public class Rule {
	private final int size;
	private final String text;

	public Rule(int size, String text) {
		this.size = size;
		this.text = text;
	}

	public int getSize() {
		return size;
	}

	public String getText() {
		return text;
	}
}
