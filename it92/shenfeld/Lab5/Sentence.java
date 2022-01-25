package it92.shenfeld.Lab5;

public class Sentence {
    private static final String punctuationSymbols = ",.!?;-—";
    private SentenceMember[] sentenceMembers;

    public Sentence(String s) {
        String[] split = s.split("(?=,|\\.|!|\\?)|\\s");
        sentenceMembers = new SentenceMember[split.length];
        for (int i = 0; i < split.length; i++) {
            if (punctuationSymbols.contains(split[i])) {
            	sentenceMembers[i] = new Punctuation(split[i]);
            } else {
            	sentenceMembers[i] = new Word(split[i]);
            }
        }
    }

    
    public void removeWords(int length) {
    	SentenceMember member;
    	for (int i = 0; i < sentenceMembers.length; i++) {
    		member = sentenceMembers[i];
    		if (member instanceof Word) {
    			Word word = (Word) member;
    			if (word.isRemovable(length)) {
    				sentenceMembers[i] = null;
    			}
    		}
    	}
    }
    
    public String toString() {
        String result = "";
        SentenceMember member;
        for (int i = 0; i < sentenceMembers.length; i++) {
        	member = sentenceMembers[i];
        	if (member == null) continue;
            result +=
                    (member instanceof Word && i != 0 ?
                            " " : "") +
                            sentenceMembers[i].toString();
        }
        return result;
    }
}