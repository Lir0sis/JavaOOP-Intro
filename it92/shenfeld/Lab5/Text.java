package it92.shenfeld.Lab5;

public class Text {
    private Sentence[] sentences;

    public Text(String s) {
        String[] split = s.split("(?<=[?!.]) ");
        sentences = new Sentence[split.length];
        
        for (int i = 0; i < split.length; i++) {
            sentences[i] = new Sentence(split[i]);
        }
    }
    
    
    
    public void removeWords(int length) {
    	for(Sentence sentence : sentences) {
    		sentence.removeWords(length);
    	}
    }

    public StringBuilder getStringBuilder() {
    	return new StringBuilder(toString());
    }
    
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Sentence sentence : sentences) {
            result.append(sentence.toString()).append(" ");
        }
        return result.toString();
    }
}