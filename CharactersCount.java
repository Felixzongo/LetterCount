

public class CharactersCount {
	
	//This program will not be able to read and count special characters such as "/ \ and space
	String printableCharaters = "!#$%&'()*+,-.0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^abcdefghijklmnopqrstuvwxyz{|}~;";
	int[] counter = new int[printableCharaters.length()];
	char character;
	int charactersUsed = 0 ;
	
	String phrase;
	CharactersCount (String phrase) {
		this.phrase = phrase;
	}
	
	public void charaterReader(String phrase) {
		for (int i = 0; i < phrase.length(); i++){
			counter(phrase.charAt(i));
		}
		print();
	}

	public void counter(char character) {
		for (int i = 0; i < printableCharaters.length(); i++){
			if (character == printableCharaters.charAt(i)){
				counter[i]++;
				
			}
		}
	}

	public void print() {
		for (int i = 0; i < counter.length; i++){
			charactersUsed += counter[i]; 
			if (counter[i] != 0) System.out.println("The number of: "+ printableCharaters.charAt(i) + " is " + counter[i] + " in this phrase" );

		}
		System.out.println("The number of characters used is " + charactersUsed);
	}	
}
