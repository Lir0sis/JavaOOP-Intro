package it92.shenfeld.Lab5;

public class Letter {
    private char symbol;

    public Letter(char symbol) {
    	this.symbol = symbol;
    }

    
    public boolean isConsant() {
    	return !Character.toString(symbol).matches("[aeiouAEIOU]");
    }
    
    public String toString() {
    	return String.valueOf(symbol);
    }
}
