package it92.shenfeld.Lab5;

public class Word extends SentenceMember {
    private Letter[] letters;

    public Word(String s) {
        char[] chars = s.toCharArray();
        letters = new Letter[s.length()];
        for (int i = 0; i < chars.length; i++) {
            letters[i] = new Letter(chars[i]);
        }
    }
    
    public boolean isRemovable(int removeLength) {
    	return removeLength == letters.length && letters[0].isConsant();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Letter letter : letters) {
            result.append(letter.toString());
        }
        return result.toString();
    }
}