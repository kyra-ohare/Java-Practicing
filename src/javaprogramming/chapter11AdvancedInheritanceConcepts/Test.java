package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Test {

	public static void main(String[] args) {
		String info = "f";
		System.out.println(getChar(info));
	}
	
	public static char getChar(String info) {
		char[] letters = info.toCharArray();
		char character = 'k';
		
		for(int i = 0; i < letters.length; i++) {
			if(i == 0)
				character = letters[i];
			else
				character = 'x';
		}
		character = Character.toUpperCase(character);
		
		return character;
	}
}
