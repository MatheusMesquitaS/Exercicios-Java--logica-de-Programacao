package dorColetiva;

public class SwitchCaseTres {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			switch (i) {
			case 1:
				System.out.println("N�mero: " + i + " - Esse � o primeiro n�mero");
				break;
			case 2:
				System.out.println("N�mero: " + i + " - Esse � o segundo n�mero");
				break;
			case 3:
				continue;
			case 4:
				System.out.println("N�mero: " + i + " - Esse � o terceiro n�mero, pulamos o 3");
				break;
			case 5:
				System.out.println("N�mero: " + i + " - Esse � o quarto n�mero");
				break;
		
			}
		}

	}
}
