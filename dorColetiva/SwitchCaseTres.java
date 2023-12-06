package dorColetiva;

public class SwitchCaseTres {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			switch (i) {
			case 1:
				System.out.println("Número: " + i + " - Esse é o primeiro número");
				break;
			case 2:
				System.out.println("Número: " + i + " - Esse é o segundo número");
				break;
			case 3:
				continue;
			case 4:
				System.out.println("Número: " + i + " - Esse é o terceiro número, pulamos o 3");
				break;
			case 5:
				System.out.println("Número: " + i + " - Esse é o quarto número");
				break;
		
			}
		}

	}
}
