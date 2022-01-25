package it92.shenfeld;

public class Lab3 {
	
	public static void main(String[] args) {
		
		// C3 = 0 - StringBuilder
		// C13 = 11 - Max length, first сonsonant
	
		StringBuilder stringBuilder = 
				new StringBuilder("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
						+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
						+ "when an unknown printer took a galley of type and scrambled it to make a type specimen book. "
						+ "It has survived not only five centuries, but also the leap into electronic typesetting, "
						+ "remaining essentially unchanged. "
						+ "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, "
						+ "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
	
		int removeLength = 4;
		
		System.out.println(stringBuilder);
	
		if (removeLength < 0 || stringBuilder.length() < 0) {
				System.out.println("Wrong searched or initial length!");
				return;
		}
		
		String[] sentences = stringBuilder.toString().split("\\p{Punct}");
		
		for (int i = 0; i < sentences.length; i++) {
			String[] words = sentences[i].trim().split(" ");
			
			for (int j = 0; j < words.length; j++) {
				if (!words[j].matches("^[aeiouAEIOU]") && words[j].length() == removeLength)
				{
					int startIndx = stringBuilder.indexOf(words[j]);
					int length = words[j].length();
					int endIndx = (stringBuilder.charAt(startIndx + length) == ' ') ? startIndx + length + 1 : startIndx + length;

					stringBuilder = new StringBuilder(stringBuilder.replace(startIndx, endIndx, ""));
				}
			}
		}
		
		System.out.println(stringBuilder);
	}
}
