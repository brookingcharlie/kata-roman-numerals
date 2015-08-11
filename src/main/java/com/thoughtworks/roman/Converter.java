package com.thoughtworks.roman;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Converter {
    private static final List<Rule> rules = Arrays.asList(
        new Rule(1000, "M"),
        new Rule(900, "CM"),
        new Rule(500, "D"),
        new Rule(400, "CD"),
        new Rule(100, "C"),
        new Rule(90, "XC"),
        new Rule(50, "L"),
        new Rule(40, "XL"),
        new Rule(10, "X"),
        new Rule(9, "IX"),
        new Rule(5, "V"),
        new Rule(4, "IV"),
        new Rule(1, "I")
    );

    public static String convert(int in) throws IllegalArgumentException {
        if (in == 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder out = new StringBuilder();
        BiFunction<Integer, Rule, Integer> applyRule = (balance, rule) -> {
            List<String> nText = Collections.nCopies(balance / rule.getSize(), rule.getText());
            out.append(String.join("", nText));
            return balance % rule.getSize();
        };
        BinaryOperator<Integer> reduceBalance = (balance, reduction) -> balance - reduction;
        rules.stream().reduce(in, applyRule, reduceBalance);
        return out.toString();
    }
}
