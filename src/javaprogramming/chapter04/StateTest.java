package javaprogramming.chapter04;

public class StateTest {

	public static void main(String[] args) {
		State ms = new State("Mato Grosso do Sul", 200000, "Campo Grande", 10000);
		ms.displayState();
		
		State pr = new State("Parana", 350000, "Curitiba", 25000);
		pr.displayState();
	}

}
