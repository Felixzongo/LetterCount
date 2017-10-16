import java.util.Scanner;

public class CharactersCountTest {
	public static void main(String[] args) {
		
		
		// getting the input phrase;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a phrase");
		// receiving input
		String phrase = input.nextLine();
		
		// Removing all unreadable characters
		phrase = phrase.replaceAll("\\s","");
		
		// If you do not need to know if the character is Upper or lower case delete the // from the line below. 
		//phrase = phrase.toUpperCase();
		//System.out.println(phrase);
		
		CharactersCount object = new CharactersCount(phrase);
		
		object.charaterReader(phrase);
		
		
		
	}

}
